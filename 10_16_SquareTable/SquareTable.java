import java.util.Scanner;

public class SquareTable{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		
		int imax = 0, mlt = 0;
		String st = "";
		
		while (imax < 2 || imax >100) {
			System.out.println("Enter maximum value (2-100):");
			imax = ip.nextInt();
		}	
		
		for (int i = 1; i<= imax; i++){
			st += (i + "^2=" + ((int)Math.pow(i, 2)) );
			
			while (i != imax){
				st += ", ";
				break;
			}
		}
		
		System.out.println(st);
	}
}