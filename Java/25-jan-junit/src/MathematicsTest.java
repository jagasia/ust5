/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * 
 */
public class MathematicsTest {
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
		maths.setNo1(2);
		maths.setNo2(3);
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
//	@Ignore
	@Category(Admin.class)
	public void testSum() {
		assertEquals(maths.sum(), 5);
	}

	/**
	 * Test method for {@link Mathematics#difference()}.
	 */
	@Test
	@Category(User.class)
	public void testDifference() {
		int actual = maths.difference();
		assertEquals(maths.difference(), actual);
	}

}
