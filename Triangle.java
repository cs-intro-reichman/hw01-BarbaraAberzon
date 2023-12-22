public class Triangle {
	public static void main(String[] args) {
		// define variable from the user
		int a = Integer.parseInt(args[0]) ;
		int b = Integer.parseInt(args[1]) ;
		int c = Integer.parseInt(args[2]) ;
		boolean result = false ; 
		
		//check Triangle Inequality Theorem exist 
		if ( (a+b>c) && (a+c>b) && (c+b>a) ){
			result = true ;
		}
		
		System.out.println( a + ", " + b + ", " + c + ": " + result ) ;
	}
}
		
		
		
		