/**
 */
package at.ac.tuwien.big.views.tests;

import at.ac.tuwien.big.views.ElementGroup;
import at.ac.tuwien.big.views.ViewsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementGroupTest extends LayoutableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementGroupTest.class);
	}

	/**
	 * Constructs a new Element Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElementGroup getFixture() {
		return (ElementGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewsFactory.eINSTANCE.createElementGroup());
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

} //ElementGroupTest
