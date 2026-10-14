import java.util.Scanner;

public class MovieRecommender
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Movie Recommender!");
		
		System.out.println("Do you like action movies? (yes/no):");
		String gust = input.nextLine();

		if (gust.equalsIgnoreCase("yes")) {
			System.out.println("Do you prefer superhero or spy movies? (superhero/spy/other):");
			String gust1_1 = input.nextLine();

			if (gust1_1.equalsIgnoreCase("superhero")) {
				System.out.println("You should watch 'Avengers: Endgame'.");
			}
			else if (gust1_1.equalsIgnoreCase("spy")) {
				System.out.println("You should watch 'Mission: Impossible Fallout'.");
			}
			else if (gust1_1.equalsIgnoreCase("other")) {
				System.out.println("You should watch 'Mad Max: Fury Road'.");
			}
		}

		else if (gust.equalsIgnoreCase("no")) {
			System.out.println("Do you like comedies? (yes/no):");
			String gust1_2 = input.nextLine();
			
			if ( gust1_2.equalsIgnoreCase("yes") ){
				System.out.println("Do you prefer smart humor or silly humor? (smart/silly/other):");
				String gust2 = input.nextLine();
				
				if ( gust2.equalsIgnoreCase("smart") ) {
					System.out.println("You should watch 'The Grand Budapest Hotel'.");
				}
				else if ( gust2.equalsIgnoreCase("silly") ) {
					System.out.println("You should watch 'The Hangover'.");
				}
				else if ( gust2.equalsIgnoreCase("other") ) {
					System.out.println("You should watch 'The Mask'.");
				}
			}
		
			else if ( gust1_2.equalsIgnoreCase("no") ){
				System.out.println("Do you like independent films? (yes/no):");
				String gust3 = input.nextLine();
				
				if ( gust3.equalsIgnoreCase("yes") ) {
					System.out.println("Do you prefer drama or experimental style? (drama/experimental/other):");
					String gust4 = input.nextLine();
					
					 if ( gust4.equalsIgnoreCase("drama") ) {
						System.out.println("You should watch 'Lady Bird'.");
					 }
					else  if ( gust4.equalsIgnoreCase("experimental") ) {
					System.out.println("You should watch 'Everything Is Illuminated'.");
					}
					else if ( gust4.equalsIgnoreCase("other") ) {
					System.out.println("You should watch 'Moonlight'.");
					}
				}
				else if ( gust3.equalsIgnoreCase("no") ) {
					System.out.println("You should watch 'Home Alone'.");	
				}
			} 
		}
		
		System.out.println("Thanks for using the Movie Recommender!");
	}
}
	