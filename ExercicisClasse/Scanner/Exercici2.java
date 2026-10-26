import java.util.Scanner;

public class Exercici2  {
	public static void main(String[] args){
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.println("Enter first temp:");
		double deg1 = input.nextDouble();
		
		System.out.println("Enter second temp:");
		double deg2 = input.nextDouble();
		
		System.out.println("Enter third temp:");
		double deg3 = input.nextDouble();
		
		System.out.println("Enter fourth temp:");
		double deg4 = input.nextDouble();
		
		System.out.printf("Enter fifth temp:");
		double deg5 = input.nextDouble();
		
		double max = Math.max( Math.max(deg1, deg2), Math.max(Math.max(deg3,deg4), deg5));
		double min = Math.min( Math.min(deg1, deg2), Math.min(Math.min(deg3,deg4), deg5));
		
		System.out.printf("Max: %.1f\n", max);
		System.out.printf("Min: %.1f", min);
	}
}