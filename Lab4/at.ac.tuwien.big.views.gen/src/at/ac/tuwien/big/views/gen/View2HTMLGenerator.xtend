package at.ac.tuwien.big.views.gen

import at.ac.tuwien.big.views.AssociationElement
import at.ac.tuwien.big.views.Class
import at.ac.tuwien.big.views.ClassIndexView
import at.ac.tuwien.big.views.ClassOperationView
import at.ac.tuwien.big.views.CreateView
import at.ac.tuwien.big.views.DateTimePicker
import at.ac.tuwien.big.views.DeleteView
import at.ac.tuwien.big.views.ElementGroup
import at.ac.tuwien.big.views.LayoutStyle
import at.ac.tuwien.big.views.List
import at.ac.tuwien.big.views.NamedElement
import at.ac.tuwien.big.views.Property
import at.ac.tuwien.big.views.PropertyElement
import at.ac.tuwien.big.views.ReadView
import at.ac.tuwien.big.views.Table
import at.ac.tuwien.big.views.Text
import at.ac.tuwien.big.views.UpdateView
import at.ac.tuwien.big.views.ViewModel
import java.io.File
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.views.View
import at.ac.tuwien.big.views.Selection
import at.ac.tuwien.big.views.ViewElement
import at.ac.tuwien.big.views.Condition
import at.ac.tuwien.big.views.VisibilityCondition
import at.ac.tuwien.big.views.VisibilityConditionType
import at.ac.tuwien.big.views.ComparisonCondition
import at.ac.tuwien.big.views.CompositeCondition
import at.ac.tuwien.big.views.ComparisonConditionType
import org.eclipse.xtend2.lib.StringConcatenation

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
	def varName(Class clazz) {
		var Class c = clazz;
		while(c.superClass != null) {
			c = c.superClass;
		}
		return c.lcName;
	}
	
	def dispatch getNavName(ClassIndexView v) {
		return v.class_.safeName + "s"
	}
	def dispatch getNavName(ClassOperationView v) {
		return v.class_.safeName
	}
	
	def idname(Class c) {
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
		<h4>«eg.header»</h4>
		<div class="panel-body">«IF eg.layout == LayoutStyle.HORIZONTAL»<div class="form-inline" role="form">«ENDIF»
			«FOR e : eg.viewElements»
				«e.toViewElementHtml»
			«ENDFOR»
		«IF eg.layout == LayoutStyle.HORIZONTAL»</div>«ENDIF»</div>
		'''
	}
	
	def toInputHtml(PropertyElement pe) {
		val container = pe.eContainer.eContainer as View;
		val clazz = container.class_;
		val propName = pe.property.lcName;
		'''
 		«pe.toConcreteInputHtml» class="form-control" «IF pe.isLongText» rows="4"«ENDIF» id="«pe.elementID»" «pe.toInputHtmlName»
 			data-ng-model="new«clazz.lcName».«propName»" «IF pe.property.isMandatory»required«ENDIF»«pe.toPatternHtml» 
 		«pe.toInputContentHtml»
		'''
	}
	
//	def dispatch toInputField(Text pe) {
//		'''
//		«IF pe.isLong»<textarea«ELSE»<input type="text"«ENDIF» class="form-control" «IF pe.isLong»rows="4" id="«pe.elementID»" name="«pe.property.lcName»"
//			data-ng-model="new«clazz.lcName».«propName»" «IF pe.property.isMandatory»required«ENDIF»«pe.toPatternHtml» 
//		'''
//	}
	
	def toConcreteInputHtml(PropertyElement pe) {
		var s = '''<input type="text"'''
		if(pe.isLongText) {
			s = "<textarea"
		} else if(pe instanceof DateTimePicker) {
			s = '''			
			<div class="input-group date" id="picker«pe.elementID»" style="«(pe as DateTimePicker).pickerStyle»">
			«s»'''
		} else if(pe instanceof Selection) {
			s = "<select data-ng-option"
		}
		return s
	}
	
	def getPickerStyle(DateTimePicker dtp) {
		val typeLcName = dtp.property.type.lcName
		switch(dtp.property.type.lcName) {
			case "date": return "calendar"
			default: return typeLcName
		}
	}
	
	def toInputHtmlName(PropertyElement pe) {
		if(pe instanceof Selection)
			return ''''''
		else
		 	return ''' name="«pe.property.lcName»"''' 
	}
	
	def toInputContentHtml(PropertyElement pe) {
		val Condition c = pe.condition
		if(pe instanceof Selection) {
			val Selection sel = pe as Selection
			return 
			'''
			>
				<option value="" disabled selected>Select your option</option>
				«FOR s : sel.selectionItems»
				<option value="«s.value»">«s.value»</option>
				«ENDFOR»
			</select>	
			'''
		} else
			return 
			'''«IF pe.condition != null»«pe.condition.toConditionHtml()»«ENDIF»
			«IF pe.isLongText»></textarea>«ELSE»/>«ENDIF»
			«IF pe instanceof DateTimePicker»
			<span class="input-group-addon"><span class="glyphicon glyphicon-«(pe as DateTimePicker).pickerStyle»"></span></span>
		</div>
			«ENDIF»'''
	}
	
	def toConditionHtml(Condition c) {
		if(!(c instanceof VisibilityCondition))
			return ''''''
		else {
			val VisibilityCondition vc = c as VisibilityCondition
			return ''' «vc.type.toConditionHtmlAttribute»="«vc.toConditionAttributeValue()»"'''
		}
	}
	
	def toConditionHtmlAttribute(VisibilityConditionType vct) {
		return "data-ng-" + vct.toString.toLowerCase
	}
	
	def dispatch toConditionAttributeValue(ComparisonCondition cc) {
		val clazz = (cc.property.eContainer.eContainer as View).class_
		return "new" + clazz.lcName + "." + cc.property.property.lcName + cc.comparisonType.asString + "'" + cc.comparisonValue + "'"
	}
	def dispatch toConditionAttributeValue(CompositeCondition cc) {
		return ""
	}
	
	def asString(ComparisonConditionType t) {
		switch(t) {
			case EQUAL: return "=="
			case GREATER: return ">"
			case LESS: return "<"
		}
		throw new IllegalArgumentException("unknown type " + t);
	}
	
	def toPatternHtml(PropertyElement pe) {
		if(pe instanceof Selection)
			return ''''''
		else
		 	return ''' data-ng-pattern="/«pe.format»/"'''
	}
	
	def isMandatory(Property p) {
		return p.lowerBound == 1 && p.upperBound == 1;
	}
	
	def isLongText(PropertyElement pe) {
		return pe instanceof Text && (pe as Text).long;
	}
	
	def format(PropertyElement t) {
		var String format
		if(t instanceof Text) {
			val x = t as Text
			format = x.format 
		} else if(t instanceof DateTimePicker) {
			val x = t as DateTimePicker
			format = x.format
		}
		return format;
	}
	
	def toViewElementHtml(ViewElement ve) {
		'''
		<div class="form-group">
			«ve.toConcretePropHtml»
		</div>
		'''	
	}
	
	def dispatch toConcretePropHtml(PropertyElement ve) {
		val container = ve.eContainer.eContainer as View;
		val clazz = container.class_;
		val sName = container.safeName;
		val propName = ve.property.lcName;
		'''
		«IF ve instanceof DateTimePicker»
		<div class="row">
			<div class="col-xs-6 col-sm-12">
				<div class="form-group">
		«ENDIF»
		<label for="«ve.elementID»">«ve.label»«IF ve.property.isMandatory»<span>*</span>«ENDIF»:</label>
		«ve.toInputHtml»
		«IF ve instanceof DateTimePicker»
				</div>
			</div>
		</div>
		«ENDIF»
		<span class="«sName»Span" style="color:red" 
			data-ng-show="«sName»Form.«propName».$dirty && «sName»Form.«propName».$invalid">
 			«IF ve.property.isMandatory»
				<span data-ng-show="«sName»Form.«propName».$error.required">Input is mandatory.</span>
 			«ENDIF»
 			«IF ve.format != null»
				<span data-ng-show="«sName»Form.«propName».$error.pattern">Input doesn't match expected pattern.</span>
 			«ENDIF»
		</span>
		'''
	}
	
	def dispatch toConcretePropHtml(AssociationElement ae) {
		'''
		<div >
		<h5>«ae.label»</h5>
		«ae.toAssociationHtml»
		<button value="Create«ae.assocClass.name»" class="btn btn-primary btn-sm">Add</button>
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
		return ae.association.navigableEnd.type as Class;
	}
	
	def saveButton(ClassOperationView v) {
		val model = v.eContainer.eContainer as ViewModel;
		if(v instanceof DeleteView || v instanceof  ReadView || v == model.welcomePage)
			return '''''';
		
		'''
		<button value="«model.welcomePage.safeName»" class="btn btn-primary btn-sm"
			data-ng-disabled="«v.safeName»Form.$invalid"
			data-ng-click="save«v.class_.safeName»()">
			Save
		</button>
		'''
	}
	
	def dispatch content(CreateView v) {
		return createAndUpdateContent(v)
	}
	
	def dispatch content(UpdateView v) {
		return createAndUpdateContent(v)
	}
	
	def createAndUpdateContent(ClassOperationView v) {
		'''
		<form name="«v.safeName»Form" novalidate>
			 <p>«v.description»</p>
			 <div class="panel-group">
			 «IF v.layout.alignment == LayoutStyle.HORIZONTAL»
			 	<div class="row">
			 «ENDIF»
			 	«FOR eg : v.elementGroups»
			 		<div class="elementgroup«IF v.layout.alignment == LayoutStyle.HORIZONTAL» col-sm-6«ENDIF»">
			 			«eg.toGroupHtml»
			 		</div>
			 	«ENDFOR»
			 «IF v.layout.alignment == LayoutStyle.HORIZONTAL»
			 	</div>
			 «ENDIF»
			 </div>
			 «v.saveButton»
		</form>
		'''
		
	}
	
	def dispatch content(ReadView v) {
		''''''
	}

	def dispatch content(DeleteView v) {
		''''''
	}
}