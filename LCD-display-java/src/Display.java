import java.util.ArrayList;
import java.util.List;

public class Display {
	
	/**
	 * Characters and Strings used to write the output
	 */
	public static final char VERTICAL_BAR = '|';
	
	public static final char HORIZONTAL_BAR = '_';
	
	public static final char WHITESPACE = ' ';
	
	public static final String LINE_BREAK = "\n";

	/**
	 * Height the displayed digits will have
	 */
	private int height;
	
	/**
	 * Width the displayed digits will have
	 */
	private int width;
	
	/**
	 * Digits to print
	 */
	private List<Integer> digits;
	
	/**
	 * Create a new display to print the given number
	 * @param size
	 * @param number
	 */
	public Display(int size, int number) {
		// Use this values to get results identical to the example
		// USING THESE VALUES WILL NOT WORK NICELY WHEN size IS 1
		//this.height = (size * 2) + 1;
		//this.width = (3 * size) - 2;
		this.height = (size * 2) + 3;
		this.width = size + 2;
		this.digits = getDigits(number);
	}
	
	/**
	 * Extract every digit in the number to print
	 * @return list containing the digits in reverse order
	 */
	private List<Integer> getDigits(int number) {
		ArrayList<Integer> digits = new ArrayList<>();
		if(number == 0)
			digits.add(0);
		int quotient = number;
		while(quotient > 0) {
			int remainder = quotient % 10;
			digits.add(remainder);
			quotient /= 10;
		}
		return digits;
	}
	
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Build every row needed to print the number, adding every digit's corresponding row
	 * @return a String made of multiple lines, containing the LCD representation of the
	 * 		specified number
	 */
	public String buildOutput() {
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < height; i++) {
			StringBuilder outputRow = new StringBuilder();
			for(int j = digits.size() - 1; j >= 0; j--) {
				outputRow.append(getRow(digits.get(j), i));
				outputRow.append(WHITESPACE);
			}
			outputRow.append(LINE_BREAK);
			output.append(outputRow.toString());
		}
		return output.toString();
	}
	
	/**
	 * Build the nth row of the given digit
	 * @param digit
	 * @param n
	 * @return the nth row of the given digit
	 */
	private String getRow(int digit, int n) {
		switch(digit) {
			case 0:
				return zeroRow(n);
			case 1:
				return oneRow(n);
			case 2:
				return twoRow(n);
			case 3:
				return threeRow(n);
			case 4:
				return fourRow(n);
			case 5:
				return fiveRow(n);
			case 6:
				return sixRow(n);
			case 7:
				return sevenRow(n);
			case 8:
				return eightRow(n);
			case 9:
				return nineRow(n);
			default:
				return "";
		}
	}
	
	/**
	 * Specifies how to build the nth row of a 0
	 * @param n
	 * @return the nth row of a 0
	 */
	private String zeroRow(int n) {
		if(n == 0)
			return buildRow(false, true, false);
		else if(n == height - 1)
			return buildRow(true, true, true);
		else
			return buildRow(true, false, true);
	}
	
	/**
	 * Specifies how to build the nth row of a 1
	 * @param n
	 * @return the nth row of a 1
	 */
	private String oneRow(int n) {
		if(n == 0)
			return buildRow(false, false, false);
		else
			return buildRow(false, false, true);
	}
	
	/**
	 * Specifies how to build the nth row of a 2
	 * @param n
	 * @return the nth row of a 2
	 */
	private String twoRow(int n) {
		if(n == 0)
			return buildRow(false, true, false);
		else if(n < (height / 2))
			return buildRow(false, false, true);
		else if(n == (height / 2))
			return buildRow(false, true, true);
		else if(n == height - 1)
			return buildRow(true, true, false);
		else
			return buildRow(true, false, false);
	}
	
	/**
	 * Specifies how to build the nth row of a 3
	 * @param n
	 * @return the nth row of a 3
	 */
	private String threeRow(int n) {
		if(n == 0)
			return buildRow(false, true, false);
		else if(n == (height / 2) || n == height - 1)
			return buildRow(false, true, true);
		else
			return buildRow(false, false, true);
	}
	
	/**
	 * Specifies how to build the nth row of a 4
	 * @param n
	 * @return the nth row of a 4
	 */
	private String fourRow(int n) {
		if(n == 0)
			return buildRow(false, false, false);
		else if(n < (height / 2))
			return buildRow(true, false, true);
		else if(n == (height / 2))
			return buildRow(true, true, true);
		else
			return buildRow(false, false, true);
	}
	
	/**
	 * Specifies how to build the nth row of a 5
	 * @param n
	 * @return the nth row of a 5
	 */
	private String fiveRow(int n) {
		if(n == 0)
			return buildRow(false, true, false);
		else if(n < (height / 2))
			return buildRow(true, false, false);
		else if(n == (height / 2))
			return buildRow(true, true, false);
		else if(n == height - 1)
			return buildRow(false, true, true);
		else
			return buildRow(false, false, true);
	}
	
	/**
	 * Specifies how to build the nth row of a 6
	 * @param n
	 * @return the nth row of a 6
	 */
	private String sixRow(int n) {
		if(n == 0)
			return buildRow(false, true, false);
		else if(n < (height / 2))
			return buildRow(true, false, false);
		else if(n == (height / 2))
			return buildRow(true, true, false);
		else if(n == height - 1)
			return buildRow(true, true, true);
		else
			return buildRow(true, false, true);
	}
	
	/**
	 * Specifies how to build the nth row of a 7
	 * @param n
	 * @return the nth row of a 7
	 */
	private String sevenRow(int n) {
		if(n == 0)
			return buildRow(false, true, false);
		else
			return buildRow(false, false, true);
	}
	
	/**
	 * Specifies how to build the nth row of an 8
	 * @param n
	 * @return the nth row of an 8
	 */
	private String eightRow(int n) {
		if(n == 0)
			return buildRow(false, true, false);
		else if(n == (height / 2)  || n == height - 1)
			return buildRow(true, true, true);
		else
			return buildRow(true, false, true);
	}
	
	/**
	 * Specifies how to build the nth row of a 9
	 * @param n
	 * @return the nth row of a 9
	 */
	private String nineRow(int n) {
		if(n == 0)
			return buildRow(false, true, false);
		else if(n < (height / 2))
			return buildRow(true, false, true);
		else if(n == (height / 2))
			return buildRow(true, true, true);
		else
			return buildRow(false, false, true);
	}
	
	/**
	 * Build a row according to the parameters
	 * @param leftEdge. Indicates if the row starts with | or with a blank space
	 * @param fillMiddle. Indicates if the row will have _ between the edges or blank spaces
	 * @param rightEdge. Indicates if the row will end with | or with a blank space
	 * @return a row with length equal to width, made of |, _ and blank spaces
	 */
	private String buildRow(boolean leftEdge, boolean fillMiddle, boolean rightEdge) {
		StringBuilder line = new StringBuilder();
		if(leftEdge)
			line.append(VERTICAL_BAR);
		else
			line.append(WHITESPACE);
		
		if(fillMiddle)
			for(int i = 1; i < width - 1; i++)
				line.append(HORIZONTAL_BAR);
				// Use the line below instead of the one above to include a space between every -
				//line.append(i % 2 == 0 ? WHITESPACE : HORIZONTAL_BAR);
		else 
			for(int i = 1; i < width - 1; i++)
				line.append(WHITESPACE);
		
		if(rightEdge)
			line.append(VERTICAL_BAR);
		else
			line.append(WHITESPACE);
		
		return line.toString();
	}
}
