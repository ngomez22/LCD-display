import java.util.ArrayList;
import java.util.List;

public class Display {
	
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
	 * Create a new display to print the given number, with the specified size
	 * @param size
	 * @param number
	 */
	public Display(int size, int number) {
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
	
	private String buildRow(boolean leftEdge, boolean fillMiddle, boolean rightEdge) {
		StringBuilder line = new StringBuilder();
		if(leftEdge)
			line.append(VERTICAL_BAR);
		else
			line.append(WHITESPACE);
		
		if(fillMiddle)
			for(int i = 1; i < width - 1; i++)
				line.append(HORIZONTAL_BAR);
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
