package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionInSingleCatchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter  A Number: ");
			int a = sc.nextInt();
			
			System.out.println("Enter  A Number: ");
			int b = sc.nextInt();
			
			double c  = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException | InputMismatchException e) {
			System.out.println("Arithmetic Or Input Miss Match Exception Exception.");
		}
		
		catch(Exception e) {
			System.out.println("Exception");
		}
		
	}
}

