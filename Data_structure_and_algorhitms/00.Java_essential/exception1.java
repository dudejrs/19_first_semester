import java.util.InputMismatchException;
import java.util.Scanner;

public class exception1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int divindend;
		int divisor;
		
		System.out.println("divindend divisor");
		divindend= scan.nextInt();
		divisor = scan.nextInt();
		scan.close();
		
		int result;
		try {
			result = divindend/divisor;
			System.out.println(result);
	
		}
		catch(ArithmeticException e){
			result = 0;
			System.out.println("divisor should not define 0");
		}
		catch(InputMismatchException e) {
			System.out.println("not integer");
		}
	}
}
