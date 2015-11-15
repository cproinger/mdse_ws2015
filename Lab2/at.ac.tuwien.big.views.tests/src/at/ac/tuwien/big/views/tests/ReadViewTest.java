/**
 */
package at.ac.tuwien.big.views.tests;

import at.ac.tuwien.big.views.ReadView;
import at.ac.tuwien.big.views.ViewsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Read View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReadViewTest extends ClassOperationViewTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReadViewTest.class);
	}

	/**
	 * Constructs a new Read View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Read View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReadView getFixture() {
		return (ReadView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewsFactory.eINSTANCE.createReadView());
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

} //ReadViewTest
