/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pror.presentation.wrspm.impl;

import de.itemis.rif12.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackagePackage;

import de.itemis.rif12.ExchangeFile.ExchangeFilePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pror.presentation.wrspm.WRSPMConfiguration;
import org.pror.presentation.wrspm.WrspmFactory;
import org.pror.presentation.wrspm.WrspmPackage;

import org.pror.ui.UIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrspmPackageImpl extends EPackageImpl implements WrspmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrspmConfigurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.pror.presentation.wrspm.WrspmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WrspmPackageImpl() {
		super(eNS_URI, WrspmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WrspmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WrspmPackage init() {
		if (isInited) return (WrspmPackage)EPackage.Registry.INSTANCE.getEPackage(WrspmPackage.eNS_URI);

		// Obtain or create and register package
		WrspmPackageImpl theWrspmPackage = (WrspmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WrspmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WrspmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UIPackage.eINSTANCE.eClass();
		ExchangeFilePackage.eINSTANCE.eClass();
		EA_AUTOSARM2_Types_PackagePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWrspmPackage.createPackageContents();

		// Initialize created meta-data
		theWrspmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWrspmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WrspmPackage.eNS_URI, theWrspmPackage);
		return theWrspmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWRSPMConfiguration() {
		return wrspmConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWRSPMConfiguration_IdType() {
		return (EReference)wrspmConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrspmFactory getWrspmFactory() {
		return (WrspmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wrspmConfigurationEClass = createEClass(WRSPM_CONFIGURATION);
		createEReference(wrspmConfigurationEClass, WRSPM_CONFIGURATION__ID_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UIPackage theUIPackage = (UIPackage)EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);
		ExchangeFilePackage theExchangeFilePackage = (ExchangeFilePackage)EPackage.Registry.INSTANCE.getEPackage(ExchangeFilePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wrspmConfigurationEClass.getESuperTypes().add(theUIPackage.getProRPresentationConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(wrspmConfigurationEClass, WRSPMConfiguration.class, "WRSPMConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWRSPMConfiguration_IdType(), theExchangeFilePackage.getDatatypeDefinitionString(), null, "idType", null, 1, 1, WRSPMConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WrspmPackageImpl
