package exception;
import java.util.Scanner;

public class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}
	public static void main(String[] args) throws CustomException{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age : ");
		int pin=sc.nextInt();
		if(pin==21) {
			System.out.println("Access Granted ");
		}
		else {
			throw new CustomException("veliya podaa ...");
		}
	}

}
