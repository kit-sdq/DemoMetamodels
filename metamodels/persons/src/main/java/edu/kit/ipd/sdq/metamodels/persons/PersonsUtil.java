package edu.kit.ipd.sdq.metamodels.persons;

import org.eclipse.emf.ecore.EObject;

public final class PersonsUtil {
	private PersonsUtil() {
	}

	/** Returns the {@linkplain PersonRegister} in which the person is contained.
	 *
	 *  @param person the person to obtain the {@linkplain PersonRegister} from, must not be <code>null</code>
	 *  @return <code>person.eContainer</code> as PersonRegister, if it actually is one
	 *  @throws UnsupportedOperationException if the container is not a {@linkplain PersonRegister}
	 */
	public static PersonRegister getPersonRegister(Person person) {
		EObject container = person.eContainer();

		if (container instanceof PersonRegister) {
			return (PersonRegister) container;
		}
		throw new UnsupportedOperationException(
			"Cannot retrieve register of a person if it is not its direct container");
	}

}
