import java.util.Scanner;

public class CountPositivesNegativesZeros{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int nPositius = 0;
		int nNegatius = 0;
		int nZeros = 0;
		
		int num = 0;
		int qtyNum = 0;
		
		while ( qtyNum <= 0){
			System.out.println("How many numbers?");
			qtyNum = input.nextInt();

		}
		
		int n = 0;
		
		while (n != qtyNum){
			n++;
			System.out.println("Enter number:");
			
			int number = input.nextInt();
			if ( number > 0 ){
				nPositius++;
			}
			else if ( number < 0 ){
				nNegatius++;
			}
			else if ( number == 0 ){
				nZeros++;
			}
		}
		
		System.out.printf("Positive: %d\nNegative: %d\nZeros: %d", nPositius, nNegatius, nZeros);
	}
}