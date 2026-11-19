package CountLetter;
import java.util.Scanner;

public class CountLetter {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		char u;
		String car = "";
		String lt = "";
		int ct = 0;
		
		System.out.println("Enter text:");
		car = ip.nextLine();
		System.out.println("Enter letter:");
		lt = ip.nextLine();
		
		int leng = car.length();
		
		for (int i = 0; i < leng; i++) {
			u = car.charAt(i);

			if (u == lt.charAt(0)) {
				ct++;
			}
		}
		
		System.out.printf("Occurrences: %d%n", ct);
	}
}
