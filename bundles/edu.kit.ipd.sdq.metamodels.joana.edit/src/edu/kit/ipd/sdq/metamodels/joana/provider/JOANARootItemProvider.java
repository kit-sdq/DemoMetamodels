/**
 */
package edu.kit.ipd.sdq.metamodels.joana.provider;


import edu.kit.ipd.sdq.metamodels.joana.JOANARoot;
import edu.kit.ipd.sdq.metamodels.joana.JoanaFactory;
import edu.kit.ipd.sdq.metamodels.joana.JoanaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.metamodels.joana.JOANARoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JOANARootItemProvider extends JoanaElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JOANARootItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(JoanaPackage.Literals.JOANA_ROOT__FLOWSPECIFICATION);
			childrenFeatures.add(JoanaPackage.Literals.JOANA_ROOT__LATTICE);
			childrenFeatures.add(JoanaPackage.Literals.JOANA_ROOT__SECURITYLEVEL);
			childrenFeatures.add(JoanaPackage.Literals.JOANA_ROOT__ANNOTATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns JOANARoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JOANARoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((JOANARoot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JOANARoot_type") :
			getString("_UI_JOANARoot_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(JOANARoot.class))
		{
			case JoanaPackage.JOANA_ROOT__FLOWSPECIFICATION:
			case JoanaPackage.JOANA_ROOT__LATTICE:
			case JoanaPackage.JOANA_ROOT__SECURITYLEVEL:
			case JoanaPackage.JOANA_ROOT__ANNOTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(JoanaPackage.Literals.JOANA_ROOT__FLOWSPECIFICATION,
				 JoanaFactory.eINSTANCE.createFlowSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(JoanaPackage.Literals.JOANA_ROOT__LATTICE,
				 JoanaFactory.eINSTANCE.createLattice()));

		newChildDescriptors.add
			(createChildParameter
				(JoanaPackage.Literals.JOANA_ROOT__SECURITYLEVEL,
				 JoanaFactory.eINSTANCE.createSecurityLevel()));

		newChildDescriptors.add
			(createChildParameter
				(JoanaPackage.Literals.JOANA_ROOT__ANNOTATION,
				 JoanaFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(JoanaPackage.Literals.JOANA_ROOT__ANNOTATION,
				 JoanaFactory.eINSTANCE.createSink()));

		newChildDescriptors.add
			(createChildParameter
				(JoanaPackage.Literals.JOANA_ROOT__ANNOTATION,
				 JoanaFactory.eINSTANCE.createSource()));
	}

}