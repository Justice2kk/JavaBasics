/*
Objectiu

    Utilitzar el tipus de dada adequat.
    Convertir un valor expressat en hores al seu equivalent en segons utilitzant operacions aritmètiques bàsiques.
    Reassignar valors a les variables. */
	
public class Hour2Seconds{
	
	public static void main(String[] args) {
		int hours = 12;
		int seconds = hours*3600;
		
		System.out.println(hours + " hours are " + seconds + " seconds");
		
		hours = 15;
		seconds = hours*3600;
		
		System.out.println(hours + " hours are " + seconds + " seconds");
		
		hours = 23;
		seconds = hours*3600;
		
		System.out.println(hours + " hours are " + seconds + " seconds");
	}
}
