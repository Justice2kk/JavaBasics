import java.util.Scanner;

public class EscapeRoom{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of keys:");
		
		int keys = input.nextInt();
		
		
		System.out.println("Final riddle solved? (true/false)");
		
		input.nextLine();
		String solved = input.nextLine();
		
		System.out.println( (keys >= 3) ? ( (solved.equalsIgnoreCase("true")) ? ("Door unlocked! Escape successful!") : ("Door unlocked! Still trapped!")) : ("Not enough keys! Still trapped!") );
	}
}