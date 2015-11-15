/**
 */
package at.ac.tuwien.big.views.tests;

import at.ac.tuwien.big.views.UpdateView;
import at.ac.tuwien.big.views.ViewsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Update View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateViewTest extends ClassOperationViewTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpdateViewTest.class);
	}

	/**
	 * Constructs a new Update View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Update View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UpdateView getFixture() {
		return (UpdateView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewsFactory.eINSTANCE.createUpdateView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UpdateViewTest
