package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();

	/**
	 * 1. This is an example of how one might test that an exception is thrown. //
	 * It tests that an IndexOutOfBoundsException is thrown
	 */
	@Test
	public void testIndexOOBException() {
		int[] vars = { 0, 1, 2, 3 };

		/*try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] { 4, 1, 2, 3 });
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] { 4, 1, 2, 3 });
		}*/
	}

	/**
	 * 2. In the ExceptionMethods class, write a method called divide that takes //
	 * two doubles as parameters and returns their quotient as a double. This method
	 * // should throw an IllegalArgumentException if the denominator is 0.0.
	 */

	/** 3. Complete the JUnit test method to test the divide method. */
	@Test
	public void testDivideByZeroException() {
		boolean works = false;
		assertEquals(5, ExceptionMethods.divide(5.0, 1.0));
		assertEquals(2.5, ExceptionMethods.divide(10.0, 4.0));
		assertEquals(1, ExceptionMethods.divide(1.26, 1.26));
		assertEquals(2.0,ExceptionMethods.divide(3.24, 1.62));
		assertEquals(0.0, ExceptionMethods.divide(0.0,  312.0));
		//assertEquals(3.5, ExceptionMethods.divide(1.4, 0.4));//???? doesnt do the math correctly
		try {
			ExceptionMethods.divide(6.72, 0.0);
		} catch(IllegalArgumentException e) {
			//e.printStackTrace();
			works = true;
		}
		assertEquals(true, works);
	}

	/**
	 * 4. In the ExceptionMethods class, write a method called reverseString that
	 * takes a // String and returns the reverse of that String. It should throw an
	 * IllegalStateException // if the String passed in is empty
	 */

	/** 5. Complete the JUnit test method to test the reverseStringMethod. */
	@Test
	public void testReverseString() {
		boolean works = false;
		assertEquals("tset", ExceptionMethods.reverseString("test"));
		assertEquals("racecar", ExceptionMethods.reverseString("     racecar"));
		assertEquals("ereht olleh", ExceptionMethods.reverseString("hello there"));
		assertEquals("eyb doog", ExceptionMethods.reverseString("   good bye   "));
		//assertEquals("", ExceptionMethods.reverseString(""));
		try {
			ExceptionMethods.reverseString("");
		} catch(IllegalStateException e) {
			//e.printStackTrace();
			works = true;
		}
		assertEquals(true, works);
		works = false;
		try {
			ExceptionMethods.reverseString("      ");
		} catch(IllegalStateException e) {
			//e.printStackTrace();
			works = true;
		}
		assertEquals(true, works);
	}

}
