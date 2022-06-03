package edu.kit.ipd.sdq.metamodels.families

import edu.kit.ipd.sdq.activextendannotations.Utility
import java.util.ArrayList

@Utility
class FamiliesUtil {
	/**
	 * Returns whether the member is a child in its family.
	 * 
	 * @param member the family member, must not be <code>null</code>
	 */
	def static boolean isChild(Member member) {
		return (member.familySon ?: member.familyDaughter) !== null
	}

	/**
	 * Returns the family of a members. Returns <code>null</code> if it has no family.
	 * 
	 * @param member the member to return the family for, must not be <code>null</code>
	 */
	def static Family getFamily(Member member) {
		return member.familyFather ?: member.familyMother ?: member.familySon ?: member.familyDaughter
	}

	/**
	 * Returns the members of a family, consisting of father, mother, sons and daughters.
	 * 
	 * @param family the family to return the members for, must not be <code>null</code>
	 */
	def static Iterable<Member> getMembers(Family family) {
		val members = new ArrayList<Member>
		if (family.father !== null) {
			members += family.father
		}
		if (family.mother !== null) {
			members += family.mother
		}
		members += family.sons
		members += family.daughters
		return members
	}

	/**
	 * Returns the register of the family of a member.
	 * 
	 * @param member the member to return the containing register for, must not be <code>null</code> and must
	 * 				have a containing family
	 * @see #getFamily(Member)
	 * @see #getRegister(Family)
	 */
	def static FamilyRegister getRegister(Member member) {
		return member.family.register
	}

	/** Returns the {@linkplain FamilyRegister} in which the family is contained.
	 * 
	 *  @param family the family to obtain the FamilyRegister from, must not be <code>null</code>
	 *  @return <code>family.eContainer</code> as {@linkplain FamilyRegister}, if it actually is one
	 *  @throws UnsupportedOperationException if the container is not a {@linkplain FamilyRegister}  
	 */
	def static FamilyRegister getRegister(Family family) {
		val container = family.eContainer
		if (container instanceof FamilyRegister) {
			return container
		} else {
			throw new UnsupportedOperationException(
				"Cannot retrieve register of a family if it is not its direct container")
		}
	}

}
