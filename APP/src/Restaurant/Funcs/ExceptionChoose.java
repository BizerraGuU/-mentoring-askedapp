package Restaurant.Funcs;

public class ExceptionChoose extends Exception {


	public ExceptionChoose(int number) {

		System.out.println("You did enter an invalid option: " + number);
		
	}
	
}
