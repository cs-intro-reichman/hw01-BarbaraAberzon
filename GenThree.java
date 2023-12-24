public class GenThree {
	public static void main(String[] args) {
		// define variable from the user and check range
		int firstNum = Integer.parseInt(args[0]) ;
		int secondNum = Integer.parseInt(args[1]) ;
		int min = Math.min(firstNum, secondNum) ;
		int max = Math.max(firstNum, secondNum) ;
		
		// get random number between the max number to the min number
		int rand1 = (int)(Math.random()*(max - min) + min) ;
		int rand2 = (int)(Math.random()*(max - min) + min) ;
		int rand3 = (int)(Math.random()*(max - min) + min) ;
		
		
		//Checking the minimum number between randoms
		int min_1 = Math.min( rand1, rand2 ) ;
		int min_2 = Math.min( min_1, rand3 ) ;
		System.out.println(rand1) ;
		System.out.println(rand2) ;
		System.out.println(rand3) ;
		System.out.println( "The minimal generated number was " + min_2 ) ;
			}
}


