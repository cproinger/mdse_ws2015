/**
 */
package at.ac.tuwien.big.views.tests;

import at.ac.tuwien.big.views.ClassIndexView;
import at.ac.tuwien.big.views.ViewsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class Index View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassIndexViewTest extends LinkableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassIndexViewTest.class);
	}

	/**
	 * Constructs a new Class Index View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassIndexViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Class Index View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClassIndexView getFixture() {
		return (ClassIndexView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewsFactory.eINSTANCE.createClassIndexView());
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

} //ClassIndexViewTest
