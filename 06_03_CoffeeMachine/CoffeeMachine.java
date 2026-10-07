import java.util.Scanner;

public class CoffeeMachine {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
			
		System.out.println("Monthly electricity cost:");
		double elCost = input.nextDouble();
		
		System.out.println("Monthly coffee machine rental cost:");
		double rental = input.nextDouble();
		
		System.out.println("Number of coffees:");
		double noCoff = input.nextDouble();
		
		System.out.println("Average coffee price:");
		double coffPrice = input.nextDouble();
		
		System.out.println("Coffee price per kilo:");
		double coffXKilo = input.nextDouble();
		
		System.out.println("Kilograms of coffee:");
		double kiloCoffe = input.nextDouble();
		
		System.out.println("Milk price per litre:");
		double milkXLitre = input.nextDouble();
		
		System.out.println("Liters of milk:");
		double litersMilk = input.nextDouble();
		
		boolean renta = (noCoff * coffPrice) >
				(elCost + rental + (coffXKilo * kiloCoffe) + (milkXLitre * litersMilk));
		
		System.out.printf("Should we buy the coffee machine? %b", renta);
	}
}