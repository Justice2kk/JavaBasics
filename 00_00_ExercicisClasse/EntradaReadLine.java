import java.util.Scanner;

public class EntradaReadLine{
	public static void main(String[] args){
		System.out.println("Exercici entrada dades per teclat");
		
		Scanner entrada = new Scanner(System.in);
		
		//double preu = 56.30;
		
		System.out.println("Bro chaval dame el precio bro:");
		double preu = entrada.nextDouble();
		
		System.out.printf("El preu és: %.2f %n", preu);
		
		System.out.println("Introdueix unitats:");
		int unitat = entrada.nextInt();
		
		System.out.printf("Unitats: %d %n", unitat );
		
		System.out.printf("El preu total és: %.2f %n", unitat*preu);
		
		System.out.println("Introdueix nom de producte:");
		
		entrada.nextLine(); // SALTAR LA LINEA
		String nom = entrada.nextLine();
		
		System.out.printf("Has comprat %.2f euros en %s", unitat*preu, nom);
	}
}