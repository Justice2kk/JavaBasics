import java.util.Scanner;

public class covidTest{
	public static void main(String[] args){
		Scanner input 	= new Scanner(System.in);

		boolean febre 		= false;
		boolean tos 		= false;
		boolean cansament 	= false;
		boolean difRespir	= false;
		boolean malCollCap	= false;
		boolean perdOlfGust	= false;
		boolean congestio 	= false;
		
		System.out.println("Tens febre? (sí/no):");
		String fb 	= input.nextLine();
		if ( fb.equalsIgnoreCase("sí") == true || fb.equalsIgnoreCase("si") == true ){
			
			febre = true;
		}	else if ( fb.equalsIgnoreCase("no") ){}		else { System.out.println("Respon "); }
		
		
		System.out.println("Tens tos? (sí/no):");
		String ts 	= input.nextLine();
		if ( ts.equalsIgnoreCase("sí") == true || ts.equalsIgnoreCase("si") == true ){
			
			tos = true;
		}	else if ( ts.equalsIgnoreCase("no") ){}		else { System.out.println("Respon "); }
		
		
		System.out.println("Tens cansament? (sí/no):");
		String cm 	= input.nextLine();
		if ( cm.equalsIgnoreCase("sí") == true || cm.equalsIgnoreCase("si") == true ){
			
			System.out.println("Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
			input.close();
			
		}	else if ( cm.equalsIgnoreCase("no") ){}		else { System.out.println("Respon "); }
		
		
		System.out.println("Tens dificultat respiratòria? (sí/no):");
		String dr 	= input.nextLine();
		if ( dr.equalsIgnoreCase("sí") == true || dr.equalsIgnoreCase("si") == true ){
			
			System.out.println("Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
			input.close();
			
		}	else if ( dr.equalsIgnoreCase("no") ){
			System.out.println("Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");			
		}		else { System.out.println("Respon "); }
		
	}
}