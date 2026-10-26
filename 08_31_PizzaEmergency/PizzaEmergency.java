import java.util.Scanner;

public class PizzaEmergency{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter pizza diameter:");
		
		double diameter = input.nextDouble();
		
		System.out.println( (diameter >= 30) ? ("Pizza for everyone!") : ("You might need another pizza!") );
	}
}