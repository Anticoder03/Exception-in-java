package day11;

public class FinalyDemo {
	public static void main(String[] args) {
		System.out.println(devide());
	}
	private static int devide() {
		try {
			double res = 10/0;
			return 1;
		}
		catch(Exception e) {
			return 2;
		}
		finally {
			return 3;
		}
	}
}
