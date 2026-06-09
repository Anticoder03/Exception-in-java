package day11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter  A Number: ");
			int a = sc.nextInt();
			
			System.out.println("Enter  A Number: ");
			int b = sc.nextInt();
			
			double c  = a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception.");
		}
		catch(InputMismatchException ie) {
			System.out.println("Input Mismatch Exception.");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
	}
}
