public class Coins {
	public static void main(String[] args) {
		// Define variable from the user and Calculation it
		int coins = Integer.parseInt(args[0]) ;
		int quarter = 0 ;
		int cent = 0 ;
		
		quarter = coins/25 ; 
		cent = coins%25 ;
		System.out.println( "Use " + quarter + " quarters and " + cent + " cents" ) ;
		}
}
		