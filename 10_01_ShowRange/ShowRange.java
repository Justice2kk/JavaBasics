import java.util.Scanner; 

public class ShowRange{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int bigger;		
		String strgs = "";
		
		System.out.println("Enter the starting number:");
		int starter = ip.nextInt();
		bigger = starter-1;
		while (bigger <= starter) {
			System.out.println("Enter the ending number:");
			bigger = ip.nextInt();
		}
		
		for (int count = starter; count <= bigger; count++) {
			strgs += (" " + count);			
		}
		
		System.out.println(strgs);
		
	}
	
}