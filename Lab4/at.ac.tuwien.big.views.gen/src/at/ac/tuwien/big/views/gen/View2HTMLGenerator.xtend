package at.ac.tuwien.big.views.gen

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.views.ViewModel
import java.util.ArrayList
import at.ac.tuwien.big.views.View
import at.ac.tuwien.big.views.CreateView
import at.ac.tuwien.big.views.ClassIndexView
import at.ac.tuwien.big.views.ClassOperationView
import at.ac.tuwien.big.views.NamedElement
import at.ac.tuwien.big.views.ReadView
import at.ac.tuwien.big.views.UpdateView
import at.ac.tuwien.big.views.DeleteView
import javax.swing.GroupLayout.Alignment
import at.ac.tuwien.big.views.LayoutStyle
import at.ac.tuwien.big.views.ElementGroup
import at.ac.tuwien.big.views.ViewElement
import at.ac.tuwien.big.views.PropertyElement
import at.ac.tuwien.big.views.AssociationElement
import at.ac.tuwien.big.views.Text
import at.ac.tuwien.big.views.DateTimePicker
import at.ac.tuwien.big.views.Property
import at.ac.tuwien.big.views.Table
import at.ac.tuwien.big.views.List

class View2HTMLGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (resource.contents.get(0) instanceof ViewModel) {
			var viewModel = resource.contents.get(0) as ViewModel		
			val htmlFileName = new File(getWelcomeGroup(viewModel).toLowerCase+".html");
			fsa.generateFile(
				htmlFileName.toString,'''
					<!DOCTYPE html>
					«var welcomegroup_name = getWelcomeGroup(viewModel).name»
					<html lang="en" data-ng-app="«welcomegroup_name»App">
					«generateHead(viewModel)»
					<body data-ng-controller="«welcomegroup_name»Controller">
						<nav class="navbar navbar-default">
							<div class="container-fluid">
								<div>
									<ul class="nav navbar-nav">
										«FOR sv : viewModel.startViews»
										<li><a href="" class="viewgroup" target="«sv.safeName»">«sv.navName»</a></li>
										«ENDFOR»
									</ul>
								</div>
							</div>
						</nav>
						«FOR vg : viewModel.viewGroups»
							«FOR v : vg.views»
								<div class="container" id="«v.safeName»">
									<h2>«v.class_.safeName»</h2>
									«v.content»
								</div>
  							«ENDFOR»
  						«ENDFOR»
«««					//add HTML Elements here
		
					</body>
					</html>'''	
			)	
		}
	}
	
	def generateHead(ViewModel viewModel) { '''
		<head>
			<title>Views</title>
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
			<script src="../assets/moment-with-locales.js"></script>
			<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
			<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
			<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css">
			<script src="../assets/datetimepickerDirective.js"></script>
			<script src="../assets/views.js"></script>
			<script src="«getWelcomeGroup(viewModel).name».js"></script>
			<script type="text/javascript">
					$(document).ready(
						function(){	
								 
«««						//register welcome view group here
						  view.addWelcomePage('«viewModel.welcomePage.safeName»');
						  view.init();
					});
			</script>
		</head>'''
	}

	def getWelcomeGroup(ViewModel model) {
		for(group : model.viewGroups)
			if(group.isWelcomeViewGroup)
				return group.name.replaceAll("\\W", "")
	}
	
	def getWelcomePage(ViewModel model) {
		for(group : model.viewGroups)
			if(group.isWelcomeViewGroup)
				for(view : group.views)
					if(view.isStartView)
						return view;
	}
	
	def startViews(ViewModel model) {
		val views = new ArrayList();
		for(group : model.viewGroups) {
			for(view : group.views)
				if(view.isStartView)
					views.add(view);
		}
		return views;
	}
	
	def getName(String st){
		return st.toLowerCase.replaceAll("\\W", "")
	}

	def safeName(NamedElement str) {
		return str.name.replaceAll("\\W", "");
	}
	def lcName(NamedElement e) {
		return e.safeName.toLowerCase;
	}
	
	def dispatch getNavName(ClassIndexView v) {
		return v.class_.safeName + "s"
	}
	def dispatch getNavName(ClassOperationView v) {
		return v.class_.safeName
	}
	
	def idname(at.ac.tuwien.big.views.Class c) {
		return c.id.name
	}
	
	def dispatch content(ClassIndexView v) {
		'''
		<h3>List of all current «v.class_.lcName»s</h3>
		<ul>
			<li data-ng-repeat="«v.class_.lcName» in «v.class_.lcName»s">{{«v.class_.lcName».«v.class_.idname»}}
			</li>
		</ul>
		'''
	}
	
	def toGroupHtml(ElementGroup eg) {
		'''
		«IF eg.layout == LayoutStyle.HORIZONTAL»
		<div class="elementgroup col-sm-6">
		«ELSE»
		<div class="elementgroup">
		«ENDIF»
			<h4>«eg.header»</h4>
			<div class="panel-body">«IF eg.layout == LayoutStyle.HORIZONTAL»<div class="form-inline" role="form">«ENDIF»
				«FOR e : eg.viewElements»
					«e.toPropHtml»
				«ENDFOR»
			«IF eg.layout == LayoutStyle.HORIZONTAL»</div>«ENDIF»</div>
		</div>
		'''
	}
	
	def dispatch toInputHtml(PropertyElement pe) {
		val clazz = pe.property.eContainer as at.ac.tuwien.big.views.Class;
		'''
 		<input type="text" class="form-control" id="«pe.elementID»" name="«pe.property.name»" 
 			data-ng-model="new«clazz.lcName».«pe.property.name»" «IF pe.property.isMandatory»required«ENDIF» «pe.format» 
 		/>
 		<span class="CreateInstituteSpan" style="color:red" 
 			data-ng-show="CreateInstituteForm.«pe.property.name».$dirty && CreateInstituteForm.«pe.property.name».$invalid">
 			<span data-ng-show="CreateInstituteForm.«pe.property.name».$error.required">Input is mandatory.</span>
 			<span data-ng-show="CreateInstituteForm.«pe.property.name».$error.pattern">Input doesn't match expected pattern.</span>
 		</span>
		'''
	}
	
	def isMandatory(Property p) {
		return p.lowerBound == 1 && p.upperBound == 1;
	}
	
	def format(PropertyElement t) {
		if(t instanceof Text) {
			val x = t as Text; 
			return '''data-ng-pattern="/«x.format»/"'''
		} else if(t instanceof DateTimePicker) {
			val x = t as DateTimePicker
			return '''data-ng-pattern="/«x.format»/"'''
		} else
			return ''''''
	}
	
	def dispatch toPropHtml(PropertyElement ve) {
		'''
			<div class="form-group">
				<label for="«ve.elementID»">«ve.label»«IF ve.property.isMandatory»<span>*</span>«ENDIF»:</label>
				«ve.toInputHtml»
			</div>
		'''
	}
	def dispatch toPropHtml(AssociationElement ae) {
		'''
			<div class="form-group">
				<div >
				<h5>«ae.label»</h5>
				«ae.toAssociationHtml»
				<button value="Create«ae.assocClass.name»" class="btn btn-primary btn-sm">Add</button>
				</div>
			</div>
		'''
	}
	
	def dispatch toAssociationHtml(Table ae) {
		val clazz = ae.assocClass;
		'''
		<table class="table table-striped" id="«ae.elementID»">
		 	<thead><tr>
		 		«FOR c : ae.columns»
		 			<th>«c.label»</th>
				«ENDFOR»
				«IF ae.link.size > 0»
					<th></th>
				«ENDIF»
			</tr></thead>
			<tbody><tr data-ng-repeat="«clazz.lcName» in «clazz.lcName»s">
				«FOR c : ae.columns»
				<td>{{ «clazz.lcName».«c.property.name» }}</td>
				«ENDFOR»
				<td><a href="" data-toggle="modal" data-target="#modalDeleteCourse" data-ng-click="getCourse(course.id)">delete</a></td>
			</tr></tbody>		
		</table>
		'''
	}
	
	def dispatch toAssociationHtml(List ae ) {
		val clazz = ae.assocClass;
		'''
		<ul id="«ae.elementID»"><li data-ng-repeat="«clazz.lcName» in «clazz.lcName»s">
				{{«clazz.lcName».«clazz.idname» }}	
				<a href="" data-ng-click="navigationProfessor('UpdateProfessor'); updateProfessor(professor.id)">udpate</a>
				</li></ul>
		'''
	}
	
	def assocClass(AssociationElement ae) {
		return ae.association.navigableEnd.type as at.ac.tuwien.big.views.Class;
	}
	
	def saveButton(ClassOperationView v) {
		// TODO if startView of welcomeGroup -> no save button
		val model = v.eContainer.eContainer as ViewModel;
		if(v instanceof DeleteView || v instanceof  ReadView || v == model.welcomePage)
			return '''''';
		
		'''
		<button value="«model.welcomePage»" class="btn btn-primary btn-sm"
			data-ng-disabled="«v.name»Form.$invalid"
			data-ng-click="save«v.class_.safeName»()">
			Save
		</button>
		'''
	}
	
	def dispatch content(CreateView v) {
		'''
		<form name="«v.safeName»Form" novalidate>
			 <p>This is a form for creating «v.class_.lcName»s.</p>
			 <div class="panel-group">
			 «IF v.layout.alignment == LayoutStyle.HORIZONTAL»
			 	<div class="row">
			 «ENDIF»
			 	«FOR eg : v.elementGroups»
			 		«eg.toGroupHtml»
			 	«ENDFOR»
			 «IF v.layout.alignment == LayoutStyle.HORIZONTAL»
			 	</div>
			 «ENDIF»
			 	«v.saveButton»
			 </div>
		</form>
		'''
	}
	
	def dispatch content(ReadView v) {
		''''''
	}
	def dispatch content(UpdateView v) {
		''''''
	}
	def dispatch content(DeleteView v) {
		''''''
	}
}