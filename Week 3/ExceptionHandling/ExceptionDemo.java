package week3;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Begin of program");
		
		int n1 = Integer.parseInt(args[0]); // PARSING -> Converting from reference data type to primitive data type
		int n2 = Integer.parseInt(args[1]);
		
		try {
			int res = n1 / n2;
			System.out.println("Result = "+res);
		}
		catch(Exception e) {
			System.err.println("Divide by 0 is not allowed."); // "err" is used to print the message in red color
		}
		
		System.out.println("End of program");
	}
}
/*
 String[] args is used to store command line arguments
 
 To run:
 > java ExceptionDemo 10 5
 		10 and 5 are command line arguments
 			args[0] = 10, args[1] = 5
*/
