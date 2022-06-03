package edu.kit.ipd.sdq.metamodels.insurance

import edu.kit.ipd.sdq.activextendannotations.Utility

@Utility
class InsuranceUtil {
	/** Returns the {@linkplain InsuranceDatabase} in which the client is contained.
	 * 
	 *  @param client the client to obtain the {@linkplain InsuranceDatabase} from, must not be <code>null</code>
	 *  @return <code>client.eContainer</code> as InsuranceDatabase, if it actually is one
	 *  @throws UnsupportedOperationException if the container is not a {@linkplain InsuranceDatabase}  
	 */
	def static InsuranceDatabase getInsuranceDatabase(InsuranceClient client) {
		val container = client.eContainer

		if (container instanceof InsuranceDatabase) {
			return container
		}
		throw new UnsupportedOperationException(
			"Cannot retrieve database of an insurance client if it is not its direct container")
	}

}
