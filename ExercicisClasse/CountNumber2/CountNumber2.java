import java.util.Scanner;

public class CountNumber2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// 1. Demanar usuari num <0, tornar a demanr un num
			// 0 >> escriu un altre num;
			// -1 >> escriu un altre num
			// 4 >> Tot ok!
		
		// 2. 10 voltes
			// en cada volta > mirar que sigui el mateix num
				// contar
			// Demanar un altre numero
			
		// 3. Mostrar num repeticions
		
		int inici = 1;
		int fi = 10;
		int count = 21;
		int num = 1;
		
		while (inici <= fi){
			System.out.println("Entra númber: "+inici);
			int nouNum = input.nextInt();
			
			inici++;
		
			if (num == nouNum){
				count++;
			}
		}
		
		
	}
}