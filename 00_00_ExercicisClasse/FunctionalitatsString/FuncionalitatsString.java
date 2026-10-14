import java.util.Scanner;

public class FuncionalitatsString{
	public static void main(String[] args){
		String frase = "Linux es mejor que Windows.";
		
		// E1: Convertir la frase a majúscules.
		String fraseUpper = frase.toUpperCase();
		System.out.println(fraseUpper);
		System.out.println();
		
		// E2: Comparar si son iguals;
		boolean isEqual = frase.equals("amongus");
		System.out.println(isEqual);
		
		//Comparar si una frase és més llarga que l'altre o iguals
		Scanner input = new Scanner(System.in);
		String reg = "Mercado de sillas";
		
		System.out.println("Pon tu frase, a ver si es más larga que la mía");
		System.out.println("Waiting...");
		
		String phrase = input.nextLine();
		
		int length = phrase.length();
		int lnDef = reg.length();
		
		if (lnDef == length){
			System.out.println("Les frases son iguals!");
		}
		else if (lnDef > length){
			System.out.println("Les frases es més petita!");
		}
		else if (lnDef < length){
			System.out.println("La teva frase es més gran!");
		}
		
		
		// Ordenar de menor a major les dues frases i motrar la longitud.
		System.out.println("////////ACTIVITAT LONGITUD////////");
		System.out.println("Dona'm la teva primera frase:");
		
		String ph1 = input.nextLine();
		
		System.out.println("Dona'm la teva segona frase:");
		String ph2 = input.nextLine();
		
		System.out.println("Dona'm la teva tercera frase:");
		String ph3 = input.nextLine();
		
		int n1 = ph1.length();
		int n2 = ph2.length();
		int n3 = ph3.length();
		
		System.out.printf("%S(%d) + %S(%d) + %S(%d)", ph1, n1, ph2, n2, ph3, n3);
	}
}