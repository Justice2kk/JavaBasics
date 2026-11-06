import java.util.Scanner;

public class PowerTable{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		
		int base = 0, max = 0;
		String st = "";
		
		while (base < 2 || base >100) {
			System.out.println("Enter the base (2-100):");
			base = ip.nextInt();
		}
		
		while (max < 2 || max >9) {
			System.out.println("Enter maximum exponent (2-9):");
			max = ip.nextInt();
		}
		
		
		for (int i = 1; i<= max; i++){
			st += (base + "^" + i + "=" + String.format("%.0f", Math.pow(base,i)));
			
			while (i != max){
				st += ", ";
				break;
			}
		}
		
		System.out.println(st);
		
	}
}