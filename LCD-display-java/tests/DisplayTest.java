import org.junit.Test;

import junit.framework.TestCase;

public class DisplayTest extends TestCase{
	
	//---------------------------------------------------------
	// Expected results
	//---------------------------------------------------------
	
	public static final String ZERO = 	" __  \n" + 
										"|  | \n" + 
										"|  | \n" + 
										"|  | \n" + 
										"|  | \n" + 
										"|  | \n" + 
										"|__| \n";
	
	public static final String ONE = 	"     \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n";
	
	public static final String TWO = 	" __  \n" + 
										"   | \n" + 
										"   | \n" + 
										" __| \n" + 
										"|    \n" + 
										"|    \n" + 
										"|__  \n";
	
	public static final String THREE = 	" __  \n" + 
										"   | \n" + 
										"   | \n" + 
										" __| \n" + 
										"   | \n" + 
										"   | \n" + 
										" __| \n";
	
	public static final String FOUR = 	"     \n" +
										"|  | \n" + 
										"|  | \n" + 
										"|__| \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n";
	
	public static final String FIVE = 	" __  \n" + 
										"|    \n" + 
										"|    \n" + 
										"|__  \n" + 
										"   | \n" + 
										"   | \n" + 
										" __| \n";
	
	public static final String SIX = 	" __  \n" + 
										"|    \n" + 
										"|    \n" + 
										"|__  \n" + 
										"|  | \n" + 
										"|  | \n" + 
										"|__| \n";
	
	public static final String SEVEN = 	" __  \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n";
	
	public static final String EIGHT = 	" __  \n" + 
										"|  | \n" + 
										"|  | \n" + 
										"|__| \n" + 
										"|  | \n" + 
										"|  | \n" + 
										"|__| \n";
	
	public static final String NINE = 	" __  \n" + 
										"|  | \n" + 
										"|  | \n" + 
										"|__| \n" + 
										"   | \n" + 
										"   | \n" + 
										"   | \n";
	
	public static final String  VALUE =	"       ___   ___         ___   ___   ___   ___   ___   ___  \n" + 
										"    |     |     | |   | |     |         | |   | |   | |   | \n" + 
										"    |     |     | |   | |     |         | |   | |   | |   | \n" + 
										"    |     |     | |   | |     |         | |   | |   | |   | \n" + 
										"    |  ___|  ___| |___| |___  |___      | |___| |___| |   | \n" + 
										"    | |         |     |     | |   |     | |   |     | |   | \n" + 
										"    | |         |     |     | |   |     | |   |     | |   | \n" + 
										"    | |         |     |     | |   |     | |   |     | |   | \n" + 
										"    | |___   ___|     |  ___| |___|     | |___|     | |___| \n";
	
	//---------------------------------------------------------
	
	public Display[] singleDigitDisplays;
	
	public Display mulipleDigitsDisplay;
	
	/**
	 * Create a display of size 2 for every digit
	 */
	public void setup() {
		singleDigitDisplays = new Display[10];
		for(int i = 0; i < 10; i++) {
			singleDigitDisplays[i] = new Display(2, i);
		}
	}
	
	/**
	 * Create a single display of size 3 for the number 1234567890
	 */
	public void setup2() {
		mulipleDigitsDisplay = new Display(3, 1234567890);
	}
	
	/**
	 * Test the height is being initialized with correct values
	 */
	@Test
	public void testHeight() {
		setup();
		for(int i = 0; i < 10; i++) {
			assertEquals((2 * 2) + 3, singleDigitDisplays[i].getHeight());
		}
	}
	
	/**
	 * Test the width is being initialized with correct values
	 */
	@Test
	public void testWidth() {
		setup();
		for(int i = 0; i < 10; i++) {
			assertEquals(2 + 2, singleDigitDisplays[i].getWidth());
		}
	}
	
	/**
	 * Test the number 0 is being printed correctly
	 */
	@Test
	public void testPrintZero() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[0].buildOutput().split("\n").length);
		assertEquals(ZERO, singleDigitDisplays[0].buildOutput());
	}
	
	/**
	 * Test the number 1 is being printed correctly
	 */
	@Test
	public void testPrintOne() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[1].buildOutput().split("\n").length);
		assertEquals(ONE, singleDigitDisplays[1].buildOutput());
	}
	
	/**
	 * Test the number 2 is being printed correctly
	 */
	@Test
	public void testPrintTwo() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[2].buildOutput().split("\n").length);
		assertEquals(TWO, singleDigitDisplays[2].buildOutput());
	}
	
	/**
	 * Test the number 3 is being printed correctly
	 */
	@Test
	public void testPrintThree() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[3].buildOutput().split("\n").length);
		assertEquals(THREE, singleDigitDisplays[3].buildOutput());
	}
	
	/**
	 * Test the number 4 is being printed correctly
	 */
	@Test
	public void testPrintFour() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[4].buildOutput().split("\n").length);
		assertEquals(FOUR, singleDigitDisplays[4].buildOutput());
	}
	
	/**
	 * Test the number 5 is being printed correctly
	 */
	@Test
	public void testPrintFive() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[5].buildOutput().split("\n").length);
		assertEquals(FIVE, singleDigitDisplays[5].buildOutput());
	}
	
	/**
	 * Test the number 6 is being printed correctly
	 */
	@Test
	public void testPrintSix() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[6].buildOutput().split("\n").length);
		assertEquals(SIX, singleDigitDisplays[6].buildOutput());
	}
	
	/**
	 * Test the number 7 is being printed correctly
	 */
	@Test
	public void testPrintSeven() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[7].buildOutput().split("\n").length);
		assertEquals(SEVEN, singleDigitDisplays[7].buildOutput());
	}
	
	/**
	 * Test the number 8 is being printed correctly
	 */
	@Test
	public void testPrintEight() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[8].buildOutput().split("\n").length);
		assertEquals(EIGHT, singleDigitDisplays[8].buildOutput());
	}
	
	/**
	 * Test the number 9 is being printed correctly
	 */
	@Test
	public void testPrintNine() {
		setup();
		assertEquals((2 * 2) + 3, singleDigitDisplays[9].buildOutput().split("\n").length);
		assertEquals(NINE, singleDigitDisplays[9].buildOutput());
	}
	
	/**
	 * Test that multiple digits are being printed correctly simultaneously
	 */
	@Test
	public void testPrintMultipleDigits() {
		setup2();
		assertEquals((3 * 2) + 3, mulipleDigitsDisplay.buildOutput().split("\n").length);
		assertEquals(VALUE, mulipleDigitsDisplay.buildOutput());
	}
}
