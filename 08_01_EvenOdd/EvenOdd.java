import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num = input.nextInt();
		
		if (num%2 == 0){
			System.out.printf("The number %d is even", num);
		}
		else{
			System.out.printf("The number %d is odd", num);
		}
		
	}
}