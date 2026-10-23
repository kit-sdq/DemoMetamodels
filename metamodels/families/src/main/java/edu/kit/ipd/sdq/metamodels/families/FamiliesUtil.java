package edu.kit.ipd.sdq.metamodels.families;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public final class FamiliesUtil {
	private FamiliesUtil() {
	}

	/**
	 * Returns whether the member is a child in its family.
	 *
	 * @param member the family member, must not be <code>null</code>
	 */
	public static boolean isChild(Member member) {
		return member.getFamilySon() != null || member.getFamilyDaughter() != null;
	}

	/**
	 * Returns the family of a members. Returns <code>null</code> if it has no family.
	 *
	 * @param member the member to return the family for, must not be <code>null</code>
	 */
	public static Family getFamily(Member member) {
		if (member.getFamilyFather() != null) {
			return member.getFamilyFather();
		}
		if (member.getFamilyMother() != null) {
			return member.getFamilyMother();
		}
		if (member.getFamilySon() != null) {
			return member.getFamilySon();
		}
		return member.getFamilyDaughter();
	}

	/**
	 * Returns the members of a family, consisting of father, mother, sons and daughters.
	 *
	 * @param family the family to return the members for, must not be <code>null</code>
	 */
	public static Iterable<Member> getMembers(Family family) {
		List<Member> members = new ArrayList<>();
		if (family.getFather() != null) {
			members.add(family.getFather());
		}
		if (family.getMother() != null) {
			members.add(family.getMother());
		}
		members.addAll(family.getSons());
		members.addAll(family.getDaughters());
		return members;
	}

	/**
	 * Returns the register of the family of a member.
	 *
	 * @param member the member to return the containing register for, must not be <code>null</code> and must
	 * 				have a containing family
	 * @see #getFamily(Member)
	 * @see #getRegister(Family)
	 */
	public static FamilyRegister getRegister(Member member) {
		return getRegister(getFamily(member));
	}

	/** Returns the {@linkplain FamilyRegister} in which the family is contained.
	 *
	 *  @param family the family to obtain the FamilyRegister from, must not be <code>null</code>
	 *  @return <code>family.eContainer</code> as {@linkplain FamilyRegister}, if it actually is one
	 *  @throws UnsupportedOperationException if the container is not a {@linkplain FamilyRegister}
	 */
	public static FamilyRegister getRegister(Family family) {
		EObject container = family.eContainer();
		if (container instanceof FamilyRegister) {
			return (FamilyRegister) container;
		} else {
			throw new UnsupportedOperationException(
				"Cannot retrieve register of a family if it is not its direct container");
		}
	}

}
