package at.ac.tuwien.big.views.gen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import at.ac.tuwien.big.views.gen.Domain2AngularJSGenerator;

public class Domain2AngularJSGeneratorModule extends
		AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "at.ac.tuwien.big.views.ViewsPackage";
	}

	@Override
	protected String getFileExtensions() {
		return "views";
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return Domain2AngularJSGenerator.class;
	}
	
	public Class<? extends IEncodingProvider> bindIEncodingProvider() {
		return Utf8EncodingProvider.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}
