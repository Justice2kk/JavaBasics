import java.util.Scanner;

public class HighestScore{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the score of the first player:");
		int score1 = input.nextInt();
		
		System.out.println("Enter the score of the second player:");
		int score2 = input.nextInt();
		
		System.out.println("Enter the score of the third player:");
		int score3 = input.nextInt();
		
		System.out.println("Enter the score of the fourth player:");
		int score4 = input.nextInt();
		
		if(score1 > score2 && score1 > score3 && score1 > score4){
			System.out.printf("The highest score is: %d", score1);
		}
		else if(score2 > score1 && score2 > score3 && score2 > score4){
			System.out.printf("The highest score is: %d", score2);
		}
		
		else if(score3 > score2 && score3 > score1 && score3 > score4){
			System.out.printf("The highest score is: %d", score3);
		}	
		
		else if(score4 > score2 && score4 > score3 && score4 > score1){
			System.out.printf("The highest score is: %d", score4);
		}	
		else if(score1 == score2 && score3 == score4 && score1 == score4){
			System.out.printf("The highest score is: %d", score1);
		}	
		
	}
}