import java.util.Scanner;

public class GuessNumberDoWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int chosenNum = 0;
		int secNum = 57;
		int attempts = 0;
		
		do {
			System.out.println("Enter a number between 1 and 100:");
			chosenNum = input.nextInt();
			
			if (chosenNum<secNum && chosenNum !> 100){
				System.out.printf("It's greater than %d\n", chosenNum);
				attempts++;
			}
			else if (chosenNum>secNum){
				System.out.printf("It's smaller than %d\n", chosenNum);
				attempts++;
			}
			else if (chosenNum > 100){
				System.out.println("At most 100!");
				attempts++;
			}
			else if (chosenNum < 1){
				System.out.println("At least 1!");
				attempts++;
			}
			
		} while (chosenNum != secNum);
		attempts++;
		System.out.println("You guessed it!");
		System.out.printf("Attempts: %d", attempts);
	}
}