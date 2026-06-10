package day11;

public class CountNumberInString {
	public static void main(String[] args) {
		String str = "hello 1 2 3";
		
		String words[] = str.split(" ");
		int count = 0;
		for (String word:words) {
			try {
				int n =Integer.parseInt(word);
				count++;
			}
			catch(NumberFormatException e) {
				
			}
		}
		System.out.println(count);
	}
}
