package at.ac.tuwien.big.views.gen

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.views.DomainModel
import at.ac.tuwien.big.views.Class
import org.eclipse.xtend2.lib.StringConcatenation

class Domain2AngularJSGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (resource.contents.get(0) instanceof DomainModel) {
			var domainModel = resource.contents.get(0) as DomainModel
			val angularJSFileName = new File(getFirstClassName(domainModel).toLowerCase+".js");
			fsa.generateFile(
				angularJSFileName.toString,
				'''
				«generateModule(domainModel)»
				«generateServices(domainModel)»
				«generateControllers(domainModel)»'''
			)
		}
	}
	
	def generateModule(DomainModel model) {
		'''var module = angular.module('«getFirstClassName(model)»App', []);'''
	}
	
	def generateServices(DomainModel model) {
'''module.service('«getFirstClassName(model)»Service', function () {
	«FOR c : model.domainModelElements.filter(Class)»
	«generateService(c)»
	«ENDFOR»
});'''
	}
	
	def generateService(Class clazz) {
		val clcName = clazz.name.toLowerCase.replaceAll("\\W", "");
		val cName = clazz.name.replaceAll("\\W", "");
'''
«««		module.service('«clcName»Service', function () {
			var «clcName»s = [];
			var «clcName»id = 0; 
			
			this.save«cName»Service = function («clcName») {
				if («clcName».id == null) {
					«clcName».id = «clcName»id++;
					«clcName»s.push(«clcName»);
				} else {
					for (i in «clcName»s) {
						if («clcName»s[i].id == «clcName».id) {
						   	«clcName»s[i] = «clcName»;
						}
					}
				}
			}
			
			this.get«cName»Service = function (id) {
				for (i in «clcName»s) {
					if («clcName»s[i].id == id) {
						return «clcName»s[i];
					}   
				}
			}
			
			
			this.delete«cName»Service = function (id) {
				for (i in «clcName»s) {
					if («clcName»s[i].id == id) {
						«clcName»s.splice(i, 1);
					}
				}
			}

			this.list«cName»Service = function () {
				return «clcName»s;
			}
«««		});
'''
	}
	
	def generateControllers(DomainModel model) {	'''
		module.controller('«getFirstClassName(model)»Controller', function ($scope, «getFirstClassName(model)»Service) {
		«FOR c : model.domainModelElements.filter(Class)»
			«val clcName = c.name.toLowerCase.replaceAll("\\W", "")»
			«val cName = c.name.replaceAll("\\W", "")»
			«val serviceName = getFirstClassName(model)»
			
			$scope.«clcName»s = «serviceName»Service.list«cName»Service();

			$scope.save«cName» = function () {
				«serviceName»Service.save«cName»Service($scope.new«clcName»);
				$scope.new«clcName» = {};
			}

			$scope.delete«cName» = function (id) {
				«serviceName»Service.delete«cName»Service(id);
			}

			$scope.update«cName» = function (id) {
				$scope.new«clcName» = angular.copy(«serviceName»Service.get«cName»Service(id));
			}

			$scope.get«cName» = function (id) {
				$scope.«clcName» = angular.copy(«serviceName»Service.get«cName»Service(id));
			}
			$scope.navigation«cName» = function (targetView) {
				$(".container").hide(); 
				var view = angular.element('#'+targetView);
				view.show();
			}
			
		«ENDFOR»
	});'''
	}
	
	def getFirstClassName(DomainModel model) {
		var classname = model.domainModelElements.filter(Class).get(0)
		return classname.name.toLowerCase.replaceAll("\\W", "");
	}	
}