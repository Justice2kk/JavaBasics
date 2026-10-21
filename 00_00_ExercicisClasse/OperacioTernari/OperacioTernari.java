import java.util.Scanner;

public class OperacioTernari{
	public static void main(String[] args){
		
		System.out.println("————— Exercici Operador Ternari —————");
		
		// Fer un programa que donat una edat entrada x teclat retorni el
		// seguent text: Si l'edat <= 1: Té 1 any, if >1 mostra Té _ anys
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quina es la teva edat?");
		int edat = input.nextInt();
		
		if (edat <= 1){
			System.out.println("Té 1 any");
		}
		else if (edat > 1){
			System.out.printf("Té %d anys\n", edat);
		}
		
		String text = (edat <= 1) ? ("Té " + edat + " any") : ("Té " + edat + " anys");
		System.out.println(text);
		
		
		// E2: Mostra si es parell o no, ==Yes; mostra numero es parell, else mostra numero es senar.
		
		System.out.println("Dona'm un número;");
		int numero = input.nextInt();

		System.out.println((numero % 2 == 0) ? ("El número es parell.") : ("El número es senar."));
	}
}