import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		try {
			Reader r = new Reader();
			List<Display> input = r.getInput();
			for(Display d : input) {
				System.out.println(d.toString());
			}
		} catch(Exception e) {
			System.out.println("Invalid input!");
		}
		
		
		System.out.println("done!");
	}

}
