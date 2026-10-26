public class Variables  {
	
	public static void main (String[] args) {
		//0.Com es defineix una variable	- CamelCa
		
		//1. Tipus de variables
		//2. Bàsics - Int, Double, Char, String
		int numAlumnes = 33;
		int numAules = 2;
		
		double alumnesAula = (double)numAlumnes / numAules;
		System.out.println("Alumnes per aula: " + alumnesAula);
		
		int convertirAEnter = (int)alumnesAula;
		System.out.println("Convertir un tipus de de double a enter: " + convertirAEnter);
		
		
		double sumaAlumnes = alumnesAula + alumnesAula;
		System.out.println("Comprovació: " + sumaAlumnes);
		
		//
		System.out.println();
		System.out.println();
		
		System.out.println("Veure si es parell: ");
		int num 	= 2007;
		int calc 	= num%2;
		
		if (calc == 1) System.out.println("Yes"); else System.out.println("No");
	}
}
