import java.util.Scanner;

public class ClosestTo21{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("PLAYER 1");
		
		int c1 = 1, c2 = 1, t1 = 0, t2 = 0;
		
		for (int i = 1; i<=3; i++){
			System.out.printf("Enter the value of card %d (1-12):%n", i);
			c1 = ip.nextInt();
			
			while (c1 >12 || c1 <1){
				System.out.println("Invalid card. Please enter a number between 1 and 12:");
				c1 = ip.nextInt();
			}
			
			t1+=c1;
		}
		
		if (t1 > 21){
			System.out.printf("Total for Player 2: %d%n", t2);
			System.out.println("Player 1 went over 21 and is eliminated!");
		}
		else{
			System.out.printf("Total for Player 1: %d%n%n", t1);
		}
		
		
		// PLAYER 2
		System.out.println("PLAYER 2");
		for (int i = 1; i<=3; i++){
			System.out.printf("Enter the value of card %d (1-12):%n", i);
			c2 = ip.nextInt();
			
			while (c2 >12 || c2 <1){
				System.out.println("Invalid card. Please enter a number between 1 and 12:");
				c2 = ip.nextInt();
			}
			
			t2+=c2;
		}
		
		if (t2 > 21){
			System.out.printf("Total for Player 2: %d%n", t2);
			System.out.printf("Player 2 went over 21 and is eliminated!%n%n");
		}
		else{
			System.out.printf("Total for Player 2: %d%n%n", t2);
		}
		
		System.out.println("FINAL RESULT");
		
		if (t1 > 21 && t2 > 21) {
			System.out.println("Both players went over 21. No winner!");
		}
		else if (t1 > 21) {
			System.out.printf("Player 2 wins with %d points!%n", t2);
		}
		else if (t2 > 21) {
			System.out.printf("Player 1 wins with %d points!%n", t1);
		}
		else if (t1 == t2) {
			System.out.printf("It's a draw! Both have %d points%n", t1);
		}
		else if (t1 > t2) {
			System.out.printf("Player 1 wins with %d points!%n", t1);
		}
		else {
			System.out.printf("Player 2 wins with %d points!%n", t2);
		}

	}
}