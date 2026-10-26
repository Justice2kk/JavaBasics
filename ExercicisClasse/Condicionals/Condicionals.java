import java.util.Scanner;

public class Condicionals{
	public static void main(String[] args){
		
		System.out.println("----Exercicis Condicionals----");
		Scanner input = new Scanner(System.in);
		System.out.println("Introdueix una edat: ");
		
		int edat = input.nextInt();
		System.out.println("L'edat és: "+edat);
		
		// if <18, "has d'anar a l'escola."
		
		if( edat<18 ){
			System.out.println("Has d'anar a l'escola");
		}
		else if( edat >= 18 && edat <= 25){
			System.out.println("Has d'anar a l'institut");
		}
		else{
			System.out.println("Has d'anar a treballar");
		}
		
		System.out.println("Awesomesauceee!!!");
	}
}