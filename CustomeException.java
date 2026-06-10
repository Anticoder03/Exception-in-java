package day11;
import java.util.Scanner;
public class CustomeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String name = sc.nextLine();
		
		try {
			if (name.contains(" ")) {
				throw new InvalidNameException("First name shuld not contain spaces");
			}
			else if (!isAlpha(name)) {
				throw new InvalidNameException("name shuld not contain numbers");
			}
			
			else {
				System.out.println(name);
			}
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static boolean isAlpha(String str) {
	    return str != null && str.matches("^[a-zA-Z]+$");
	}
}
