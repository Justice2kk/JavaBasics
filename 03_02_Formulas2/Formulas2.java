public class Formulas2{
	
	public static void main(String[] arg){
		double a = 25.5;
		double b = 50.67;
		double c = 2.0;
		double d = 10.5;
		double e = -2.5;
		double f = 13.6;
		double g = 2.2;
		double h = Math.PI;

		double formula1 = Math.sqrt(a) * (Math.pow(b, 4) - Math.pow(c, 3)) / (2 * d);

		double formula2 = (3 * Math.pow(e, 2) - Math.pow(f, 3)) / (h * Math.sqrt(g));

		System.out.println("Formula 1 = " + formula1);
		System.out.println("Formula 2 = " + formula2);
	}
}