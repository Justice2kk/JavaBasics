/*
Objectiu

    Calcular el valor de la potència aplicant la fórmula corresponent.
    Utilitzar els tipus de dades adequats per tal d’obtenir el resultat esperat.	*/

public class PowerFormula {

	public static void main(String[] args) {
		double force = 125;
		double distance = 37;
		double time = 12;
	
		double power = (force * distance) / time;
		System.out.println("Power: = " + power + " W");		 
	}
}