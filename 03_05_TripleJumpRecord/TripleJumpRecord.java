public class TripleJumpRecord{
	
	public static void main(String[] arg){
		// Current record
		double record = 18.29;
		
		// Player records
		double jump1 = 15.58;
		double jump2 = 18.35;
		double jump3 = 17.26;
		double jump4 = 18.31;
				
		// Get new record
		double maxT1 = Math.max(jump1, jump2);
		double maxT2 = Math.max(jump3, jump4);
		double max	 = Math.max(maxT1, maxT2);
		
		// Display the new record
		System.out.println("The current record is now " + max + " meters");
		
		// Display the next integer value
		System.out.println("The current record is below " + Math.round(Math.ceil(max)) + " meters");

		// Display the previous integer value
		System.out.println("The current record is above " + Math.round(Math.floor(max)) + " meters");
		
	}
}

/*Output
The current record is now 18.35 meters
The current record is below 19 meters
The current record is above 18 meters
*/