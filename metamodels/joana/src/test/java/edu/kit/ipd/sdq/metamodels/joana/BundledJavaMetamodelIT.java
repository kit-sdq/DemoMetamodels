package edu.kit.ipd.sdq.metamodels.joana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.ParametersFactory;
import org.junit.jupiter.api.Test;

/**
 * Runs against the packaged jar without the JaMoPP dependencies on the classpath, so it fails if the bundled Java
 * metamodel is missing or incomplete.
 */
class BundledJavaMetamodelIT {
	@Test
	void javaMetamodelIsBundled() {
		assertEquals(codeSource(JoanaPackage.class), codeSource(ParametersFactory.class));
	}

	@Test
	void annotationOfJavaParameterSurvivesSerialization() throws IOException {
		OrdinaryParameter parameter = ParametersFactory.eINSTANCE.createOrdinaryParameter();
		parameter.setName("secret");
		Sink sink = JoanaFactory.eINSTANCE.createSink();
		sink.setName("output");
		sink.setAnnotatedParameter(parameter);

		Resource resource = createResourceSet().createResource(URI.createURI("test.xmi"));
		resource.getContents().add(sink);
		resource.getContents().add(parameter);
		ByteArrayOutputStream serialized = new ByteArrayOutputStream();
		resource.save(serialized, null);

		Resource loaded = createResourceSet().createResource(URI.createURI("test.xmi"));
		loaded.load(new ByteArrayInputStream(serialized.toByteArray()), null);
		Sink loadedSink = (Sink) loaded.getContents().get(0);
		assertEquals("output", loadedSink.getName());
		assertEquals("secret", loadedSink.getAnnotatedParameter().getName());
	}

	private static ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return resourceSet;
	}

	private static URL codeSource(Class<?> type) {
		return type.getProtectionDomain().getCodeSource().getLocation();
	}
}
