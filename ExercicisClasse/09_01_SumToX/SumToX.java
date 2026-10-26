import java.util.Scanner;

public class SumToX{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int numChosen = 0;
		int res = 0;
		int prevNum = 0;
		int tValue = 0;
	
		System.out.println("Enter number > 10:");
		numChosen = input.nextInt();
		
		while (numChosen < 10){
			System.out.println("Enter number > 10:");
			numChosen = input.nextInt();
		}
		
		while (num <= numChosen){
			prevNum += num;
			num++;
			
			tValue = prevNum + num;
		}
		
		System.out.printf("Total = %d", tValue);
	}
}