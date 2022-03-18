package assignments;
import java.util.InputMismatchException;
import java.util.Scanner;

class InputOperatorException extends Exception {
	
	public InputOperatorException()
    {
        super();
    }	
}

public class OperatorErroHandling {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		try {
			int operand1 = input.nextInt();
			String operator = input.next();
			
			if (!isValidOperator(operator)) {
				throw new InputOperatorException();
			}
			
			int operand2 = input.nextInt();	
			
			switch (operator){
				case "+":
					System.out.println(operand1 + operand2);
					break;
					
				case "-":
					System.out.println(operand1 - operand2);
					break;
					
				case "*":
					System.out.println(operand1 * operand2);
					break;
					
				case "/":
					System.out.println(operand1 / operand2);
					break;
			}
		}
		
		catch (InputMismatchException e) {
			System.out.println("invalid operand: " + e);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Can't divide by Zero!: ");
		}
		
		catch (InputOperatorException e) {
			System.out.println("invalid operator: " + e);
		}

	}
	
	private static boolean isValidOperator(String s) {
		
		String[] ops = {"+", "-", "*", "/"};
		
		for (String val: ops) {
			if (val.equals(s)) {
				return true;
			}
		}
		
		return false;
	}

}
