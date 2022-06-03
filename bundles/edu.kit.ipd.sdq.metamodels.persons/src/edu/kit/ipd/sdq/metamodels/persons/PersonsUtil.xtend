package edu.kit.ipd.sdq.metamodels.persons

import edu.kit.ipd.sdq.activextendannotations.Utility

@Utility
class PersonsUtil {
	/** Returns the {@linkplain PersonRegister} in which the person is contained.
	 * 
	 *  @param person the person to obtain the {@linkplain PersonRegister} from, must not be <code>null</code>
	 *  @return <code>person.eContainer</code> as PersonRegister, if it actually is one
	 *  @throws UnsupportedOperationException if the container is not a {@linkplain PersonRegister}  
	 */
	def static PersonRegister getPersonRegister(Person person) {
		val container = person.eContainer

		if (container instanceof PersonRegister) {
			return container
		}
		throw new UnsupportedOperationException(
			"Cannot retrieve register of a person if it is not its direct container")
	}

}
