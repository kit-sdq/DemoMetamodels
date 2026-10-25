package edu.kit.ipd.sdq.metamodels.smarthome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;

/**
 * Checks that a smart home system contains its protocols, components and links, so that a whole system can be stored
 * in a single resource.
 */
class SmarthomeIT {
	@Test
	void smartHomeSystemSurvivesSerialization() throws IOException {
		SmarthomeFactory factory = SmarthomeFactory.eINSTANCE;
		Protocol protocol = factory.createProtocol();
		protocol.setName("zigbee");
		Device device = factory.createDevice();
		device.setName("lamp");
		device.getSupportedProtocols().add(protocol);
		Server server = factory.createServer();
		server.setName("hub");
		server.getSupportedProtocols().add(protocol);
		Link link = factory.createLink();
		link.setProtocol(protocol);
		link.getComponents().add(device);
		link.getComponents().add(server);
		SmartHomeSystem system = factory.createSmartHomeSystem();
		system.getProtocols().add(protocol);
		system.getComponents().add(device);
		system.getComponents().add(server);
		system.getLinks().add(link);

		Resource resource = createResourceSet().createResource(URI.createURI("test.xmi"));
		resource.getContents().add(system);
		ByteArrayOutputStream serialized = new ByteArrayOutputStream();
		resource.save(serialized, null);

		Resource loaded = createResourceSet().createResource(URI.createURI("test.xmi"));
		loaded.load(new ByteArrayInputStream(serialized.toByteArray()), null);
		assertEquals(1, loaded.getContents().size());
		SmartHomeSystem loadedSystem = (SmartHomeSystem) loaded.getContents().get(0);
		assertEquals(1, loadedSystem.getProtocols().size());
		assertEquals(2, loadedSystem.getComponents().size());
		assertEquals(1, loadedSystem.getLinks().size());
		Link loadedLink = loadedSystem.getLinks().get(0);
		assertSame(loadedSystem.getProtocols().get(0), loadedLink.getProtocol());
		assertEquals(loadedSystem.getComponents(), loadedLink.getComponents());
	}

	private static ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return resourceSet;
	}
}
