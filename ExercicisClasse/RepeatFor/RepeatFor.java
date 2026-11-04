import java.util.Scanner;

public class RepeatFor{
	public static void main(String[] args){
		// Bloc 1: Demanar numero > 0
		Scanner ip = new Scanner(System.in);		
		int val = 0;
		
		while (val <= 0){
			System.out.print("How many times? ");
			
			val = ip.nextInt();
		}
		for (int i = 0; i <= val; i++){
			System.out.println("Java is fun!" + i);
		}
	}
}