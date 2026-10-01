import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.println("Enter first price:");
		
		int dig1 = input.nextInt();
		
		System.out.println("Enter second price:");
		int dig2 = input.nextInt();
		
		System.out.println("Enter third price:");
		int dig3 = input.nextInt();
		
		System.out.println("Enter fourth price:");
		int dig4 = input.nextInt();
		
		System.out.println("Enter fifth price:");
		int dig5 = input.nextInt();
		
		int total = dig1 + dig2 + dig3 + dig4 + dig5;
		double avg = (double)total/5;
		
		System.out.printf("Total price: %d \n", total);
		System.out.printf("Average: %.1f", avg);
		
	}
}