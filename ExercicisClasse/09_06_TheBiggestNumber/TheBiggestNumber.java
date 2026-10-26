import java.util.Scanner;

public class TheBiggestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive numbers. Enter a negative number to finish:");
		
		int number = 0;
		int inumber = 0;
		
		String count = ""; 
		
		while (inumber > -1){
			inumber = input.nextInt();
			
			if (inumber > number) {
				number = inumber;
			}
		}
		
		if (number == 0){
			System.out.println("No positive numbers were entered");
		}
		else{
		System.out.printf("The biggest number is: %d\n", number);
		}
	}
}