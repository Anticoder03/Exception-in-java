package day11;
import java.util.Scanner;
public class DefaultExceptionHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("Enter Second number: ");
		int secondNumber = scanner.nextInt();
		

		try{
		int result = number / secondNumber;
		System.out.println("Result: " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero. Please provide a non-zero second number.");
			
		}
	}
}
