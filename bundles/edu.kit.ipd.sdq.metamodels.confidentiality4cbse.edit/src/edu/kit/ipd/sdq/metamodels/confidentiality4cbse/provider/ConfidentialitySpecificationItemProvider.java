/**
 */
package edu.kit.ipd.sdq.metamodels.confidentiality4cbse.provider;


import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.Confidentiality4cbsePackage;
import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.ConfidentialitySpecification;

import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.data.DataFactory;

import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.repository.RepositoryFactory;

import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.resources.ResourcesFactory;

import edu.kit.ipd.sdq.metamodels.confidentiality4cbse.system.SystemFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.metamodels.confidentiality4cbse.ConfidentialitySpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfidentialitySpecificationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialitySpecificationItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__INFORMATION_FLOWS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__INFORMATION_FLOW_PARAMETERS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__LOCATIONS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__RESOURCE_PROTECTIONS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__RESOURCE_CONFIDENTIALITIES);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__ENCRYPTIONS);
			childrenFeatures.add(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__USER_IDENTIFIERS);
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
	 * This returns ConfidentialitySpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfidentialitySpecification"));
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
		return getString("_UI_ConfidentialitySpecification_type");
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

		switch (notification.getFeatureID(ConfidentialitySpecification.class))
		{
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__INFORMATION_FLOWS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__INFORMATION_FLOW_PARAMETERS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__LOCATIONS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__RESOURCE_PROTECTIONS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__RESOURCE_CONFIDENTIALITIES:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__ENCRYPTIONS:
			case Confidentiality4cbsePackage.CONFIDENTIALITY_SPECIFICATION__USER_IDENTIFIERS:
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
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER,
				 DataFactory.eINSTANCE.createDataSet()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER,
				 DataFactory.eINSTANCE.createDataSetMapEntry()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER,
				 DataFactory.eINSTANCE.createParameterizedDataSetMapEntry()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_IDENTIFIER,
				 DataFactory.eINSTANCE.createSpecificationParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__DATA_SET_MAPS,
				 DataFactory.eINSTANCE.createDataSetMap()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__ADDED_SERVICE_PARAMETERS,
				 RepositoryFactory.eINSTANCE.createAddedServiceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__INFORMATION_FLOWS,
				 RepositoryFactory.eINSTANCE.createInterfaceInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__INFORMATION_FLOWS,
				 RepositoryFactory.eINSTANCE.createSignatureInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__INFORMATION_FLOW_PARAMETERS,
				 RepositoryFactory.eINSTANCE.createInformationFlowParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS,
				 SystemFactory.eINSTANCE.createSpecificationParameter2DataSetAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_ASSIGNMENTS,
				 SystemFactory.eINSTANCE.createDataSetMapParameter2KeyAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__SPECIFICATION_PARAMETER_EQUATIONS,
				 SystemFactory.eINSTANCE.createSpecificationParameterEquation()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__LOCATIONS,
				 ResourcesFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__TAMPER_PROTECTIONS,
				 ResourcesFactory.eINSTANCE.createTamperProtection()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__RESOURCE_PROTECTIONS,
				 ResourcesFactory.eINSTANCE.createLinkingResourceProtection()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__RESOURCE_PROTECTIONS,
				 ResourcesFactory.eINSTANCE.createResourceContainerProtection()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__RESOURCE_CONFIDENTIALITIES,
				 ResourcesFactory.eINSTANCE.createResourceContainerConfidentiality()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__ENCRYPTIONS,
				 ResourcesFactory.eINSTANCE.createEncryption()));

		newChildDescriptors.add
			(createChildParameter
				(Confidentiality4cbsePackage.Literals.CONFIDENTIALITY_SPECIFICATION__USER_IDENTIFIERS,
				 DataFactory.eINSTANCE.createUserIdentifier()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return Confidentiality4cbseEditPlugin.INSTANCE;
	}

}
