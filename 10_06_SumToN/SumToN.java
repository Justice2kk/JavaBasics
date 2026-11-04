import java.util.Scanner;

public class SumToN{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		
		int inp = 0, comp = 0;
		while (inp <= 1){
			System.out.println("Enter a number (greater than 1):");
			inp = ip.nextInt();
		}
		
		for (int i = 0; i <= inp; i++){
			comp += i;
		}
		System.out.println("Sum = " + comp);
	}
}