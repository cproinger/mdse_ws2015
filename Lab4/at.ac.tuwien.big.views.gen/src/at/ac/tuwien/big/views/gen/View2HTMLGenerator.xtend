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
						  view.addWelcomePage('«viewModel.welcomePage»');
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
						return view.name.replaceAll("\\W", "");
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
	
	def dispatch getNavName(ClassIndexView v) {
		return v.class_.safeName + "s"
	}
	def dispatch getNavName(ClassOperationView v) {
		return v.class_.safeName
	}
	
}