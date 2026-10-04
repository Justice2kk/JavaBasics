public class RoadTrip {
	public static void main(String[] args) {

		double dist = 347.8;
		double consum = 6.7;

		double preuGasl = 1.92;
		int nPassatgers = 4;

		double tolls = 12.65;
		int menjarAnada = 30;
		int menjarTorn = 30;
		double costPark = 18.5;

		// CALCULS
		double distTotal = dist * 2;
		double combNeces = (consum * distTotal) / 100;

		double costComb = combNeces * preuGasl;
		double costToll = tolls * 2;

		int costFood = menjarAnada + menjarTorn;

		double costTotal = costComb + costToll + costPark + costFood;
		double costPersona = costTotal / nPassatgers;


		// PRINTS
		System.out.printf("=========== ROAD TRIP ===========%n");

		System.out.printf("%-20s%10.2f km%n", "Round trip distance:", distTotal);

		System.out.printf("---------------------------------%n");

		System.out.printf("%-20s%10.2f L%n", "Fuel needed:", combNeces);
		System.out.printf("%-20s%10.2f €%n", "Fuel cost:", costComb);

		System.out.printf("---------------------------------%n");

		System.out.printf("%-20s%10.2f €%n", "Tolls:", costToll);
		System.out.printf("%-20s%10.2f €%n", "Parking price:", costPark);
		System.out.printf("%-20s%10.2f €%n", "Food:", (double) costFood);

		System.out.printf("---------------------------------%n");

		System.out.printf("%-20s%10.2f €%n", "Total trip cost:", costTotal);
		System.out.printf("%-20s%10d%n", "Passengers:", nPassatgers);
		System.out.printf("%-20s%10.2f €%n", "Cost per passenger:", costPersona);

		System.out.printf("=================================%n");
	}
}