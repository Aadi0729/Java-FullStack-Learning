Checked Exceptions
------------------
Other than Runtime Exceptions like IOException, SQLException, User defined exceptions etc are Checked Exceptions
If a method throws an exception then this method need to be caught (try and catch) or declared to be thrown (throws)

package week3;

import java.io.IOException;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws IOException {
		/*
		  try { 
		  	int n = System.in.read(); 
		  } 
		  catch (IOException e) {
		  
		  }
		 */
		int n = System.in.read();
	}
}
