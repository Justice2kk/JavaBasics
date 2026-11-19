package a12_33_graphic3AscendingTriangle1;
import java.util.Scanner;


public class Graphic3AscendingTriangle1 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int num = 0;
		char ch = 'A';
		String str = "";
		
		System.out.println("Enter number of lines:");
		num = ip.nextInt();
		
		System.out.println("Enter character:");
		ch = ip.next().charAt(0);
		
		
		for (int i = 0; i<=num; i++) {
			str += ch;
			System.out.println(str);
		}
	}
}
