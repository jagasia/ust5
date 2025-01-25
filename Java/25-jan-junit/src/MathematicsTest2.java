/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * 
 */
public class MathematicsTest2 {
	//CUT is Mathematics
	Mathematics maths=new Mathematics();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		maths.setNo1(11);
		maths.setNo2(9);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Mathematics#sum()}.
	 */
	@Test
	@Category(User.class)
	public void testSum() {
		assertEquals(maths.sum(), 20);
	}

	/**
	 * Test method for {@link Mathematics#difference()}.
	 */
	@Test
	@Category(Admin.class)
	public void testDifference() {
		int actual = maths.difference();
		assertEquals(maths.difference(), actual);
	}

}
