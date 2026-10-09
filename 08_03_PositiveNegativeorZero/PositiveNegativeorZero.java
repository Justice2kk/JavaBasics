import java.util.Scanner;

public class PositiveNegativeorZero{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		int integ = input.nextInt();
		
		if (integ == 0){
			System.out.println("The number 0 is zero");
			
		}
		else if (integ < 0){
			System.out.printf("The number %d is negative", integ);
		}
		else if (integ > 0){
			System.out.printf("The number %d is positive", integ);
		}
		
	}
}