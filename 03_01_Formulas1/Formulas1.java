public class Formulas1{
	
	public static void main(String[] args){
		double a = 25.5;
		double b = 50.67;
		double c = 2.0;
		double d = 10.5;
		double e = -2.5;
		double f = 13.6;
		double h = Math.PI;
		
		double formula1 = Math.sqrt(a)+Math.pow(b,4)/c;
		System.out.println("Formula 1 = " + formula1);
		
		double formula2 = 2*h*((Math.pow(d,3) - Math.pow(e,4))/(f-h));
		System.out.println("Formula 2 = " + formula2);	
	}	
}