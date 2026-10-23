package edu.kit.ipd.sdq.metamodels.confidentiality4cbse;

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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;
import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.data.DataFactory;
import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.data.DataSet;

/**
 * Runs against the packaged jar without the PCM and CDO dependencies on the classpath, so it fails if the bundled
 * Palladio Component Model or one of its dependencies is missing or incomplete.
 */
class BundledPalladioComponentModelIT {
	@Test
	void palladioComponentModelIsBundled() {
		URL jar = codeSource(Confidentiality4cbsePackage.class);
		assertEquals(jar, codeSource(RepositoryFactory.class));
		assertEquals(jar, codeSource(IdentifierPackage.class));
		assertEquals(jar, codeSource(ProbfunctionPackage.class));
		assertEquals(jar, codeSource(StoexPackage.class));
		assertEquals(jar, codeSource(UnitsPackage.class));
		assertEquals(jar, codeSource(CDOObjectImpl.class));
	}

	@Test
	void specificationAndRepositorySurviveSerialization() throws IOException {
		Repository repository = RepositoryFactory.eINSTANCE.createRepository();
		repository.setEntityName("shop");
		OperationInterface shopInterface = RepositoryFactory.eINSTANCE.createOperationInterface();
		shopInterface.setEntityName("IShop");
		repository.getInterfaces__Repository().add(shopInterface);
		ConfidentialitySpecification specification = Confidentiality4cbseFactory.eINSTANCE
				.createConfidentialitySpecification();
		specification.setEntityName("specification");
		DataSet customerData = DataFactory.eINSTANCE.createDataSet();
		customerData.setEntityName("customer data");
		specification.getDataIdentifier().add(customerData);

		Resource resource = createResourceSet().createResource(URI.createURI("test.xmi"));
		resource.getContents().add(repository);
		resource.getContents().add(specification);
		ByteArrayOutputStream serialized = new ByteArrayOutputStream();
		resource.save(serialized, null);

		Resource loaded = createResourceSet().createResource(URI.createURI("test.xmi"));
		loaded.load(new ByteArrayInputStream(serialized.toByteArray()), null);
		Repository loadedRepository = (Repository) loaded.getContents().get(0);
		assertEquals(repository.getId(), loadedRepository.getId());
		assertEquals("IShop", loadedRepository.getInterfaces__Repository().get(0).getEntityName());
		ConfidentialitySpecification loadedSpecification = (ConfidentialitySpecification) loaded.getContents().get(1);
		assertEquals("customer data", loadedSpecification.getDataIdentifier().get(0).getEntityName());
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
