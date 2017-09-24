import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
	
	/**
	 * Characters to be used as delimiters in the input
	 */
	public static final String DELIMITER = ",";
	
	/**
	 * Line that marks the end of the input
	 */
	public static final String END = "0" + DELIMITER + "0";
	
	/**
	 * Scanner for the standard input stream 
	 */
	private Scanner sc;
	
	/**
	 * Constructor
	 * Initialize the scanner
	 */
	public Reader() {
		sc = new Scanner(System.in);
	}
	
	/**
	 * Reads the input provided by the user
	 */
	public List<Display> getInput() throws Exception {
		ArrayList<Display> input = new ArrayList<>();
		String line = sc.nextLine();
		while(!line.equals(END)) {
			String[] data = line.split(DELIMITER);
			if(data.length != 2) throw new Exception("Invalid input");
			int size = Integer.parseInt(data[0].trim());
			int number = Integer.parseInt(data[1].trim());
			if(size < 1 || size > 10) throw new Exception("Invalid size");
			input.add(new Display(size, number));
			line = sc.nextLine();
		}
		return input;
	}

}
