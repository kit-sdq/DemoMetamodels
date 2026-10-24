package edu.kit.ipd.sdq.metamodels.insurance;

import org.eclipse.emf.ecore.EObject;

public final class InsuranceUtil {
	private InsuranceUtil() {
	}

	/** Returns the {@linkplain InsuranceDatabase} in which the client is contained.
	 *
	 *  @param client the client to obtain the {@linkplain InsuranceDatabase} from, must not be <code>null</code>
	 *  @return <code>client.eContainer</code> as InsuranceDatabase, if it actually is one
	 *  @throws UnsupportedOperationException if the container is not a {@linkplain InsuranceDatabase}
	 */
	public static InsuranceDatabase getInsuranceDatabase(InsuranceClient client) {
		EObject container = client.eContainer();

		if (container instanceof InsuranceDatabase) {
			return (InsuranceDatabase) container;
		}
		throw new UnsupportedOperationException(
			"Cannot retrieve database of an insurance client if it is not its direct container");
	}

}
