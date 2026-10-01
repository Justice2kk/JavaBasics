import java.util.Scanner;

public class Exerc3{
	
	public static void main(String[] args){
		Scanner input;
		input = new Scanner(System.in);
		
		
		System.out.println("Enter street number:");
		String stNum		= input.nextLine();
		
		System.out.println("Enter street name:");
		String stName	= input.nextLine();
		
		System.out.println("Enter city:");
		String city		= input.nextLine();
		
		System.out.println("Enter country:");
		String count	= input.nextLine();
		
		System.out.println("Enter postal code:");
		String pC		= input.nextLine();
		
		System.out.printf("Your address is:\n%s %s\n%s\n%s\n%s\n", stNum, stName, city, count, pC);
	}
}