import java.util.Scanner;

public class GymMembership{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		double basicPrice = 24.9;
		double multiPrice = 34.9;
		
		double allDayQuota = 7.5;
		double piscinaSauna = 9.9;
		
		double quota = 0;
		
		System.out.printf("\tHello, welcome to Gym membership! Select your Gym quota:\n");
		System.out.printf("\t\t1: Basic Gym(%.2f €)\t2:Multi Gym(%.2f €):  ", basicPrice, multiPrice);
		
		int option = input.nextInt();
		
		if ( option != 1 && option != 2 ){
			System.out.println("Invalid option");
		}
		else if ( option == 1 ) {
			
			
		}
		
		else if ( option == 2 ) {
			quota = quota + multiPrice;
			
			System.out.printf("\n\t\t\t\t\t\t\t\t\tQuota: %.2f €", quota);
			System.out.printf("\n\t\t\tSelect your preferred timetable:\n");
			System.out.printf("1: Mornings (06:00—12:00): No extra payments\t2:All Day: +7.50 €/month:  ");
			
			int optionHorAccess = input.nextInt();
			
			if ( optionHorAccess != 1 && optionHorAccess !=2 ){
				System.out.println("Invalid option");
			}
			else if ( optionHorAccess == 2){
				quota = quota + allDayQuota;
				System.out.println("quieres sauna?");
				
				
			}
			
		}
		
		
	}
	
}