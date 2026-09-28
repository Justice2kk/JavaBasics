public class Decimals{
	public static void main(String[] arg){
		double x = 12.3456789;
		int n = 1;
		
		double res = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		
		n = 0;
		res = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + (int)res);
	
		n = 2;
		res = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + res);
		
		n = 4;
		res = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + res);
		
		n = 6;
		res = Math.round(x * Math.pow(10, n)) / Math.pow(10.0, n);
		System.out.println("Rounded to " + n + " decimals: " + res);
	}	
}