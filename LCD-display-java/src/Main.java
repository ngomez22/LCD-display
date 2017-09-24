public class Main {
	
	public static void main(String[] args) {
		try {
			Reader r = new Reader();
			for(Display d : r.getInput()) {
				System.out.println(d.buildOutput());
			}
		} catch(NumberFormatException nfe) {
			System.out.println("Input should be numeric");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
