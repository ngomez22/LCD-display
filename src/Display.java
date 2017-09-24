
public class Display {

	/**
	 * Size the displayed digits will have
	 */
	private int size;
	
	/**
	 * Digits to print
	 */
	private int number;
	
	/**
	 * 
	 * @param size
	 * @param number
	 */
	public Display(int size, int number) {
		this.size = size;
		this.number = number;
	}
	
	public String toString() {
		return size + ", " + number;
	}

}
