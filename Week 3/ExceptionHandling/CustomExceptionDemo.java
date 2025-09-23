Create a user defined exception "AgeException".
Create a class "Customer" with a method "setAge()" which takes "age" as an argument.
If the age is <18 or 60 then it should throw "AgeException" with the message "Age should be between 18 and 60".

package week3;

class AgeException extends Exception {
	AgeException(String msg) {
		super(msg);
	}
	AgeException() {}
}

class Customer {
	void setAge(int age) throws AgeException {
		if (age < 18 || age > 60)
			throw new AgeException("Age should be between 18 and 60");
		else
			System.out.println("Your Age: "+age);
	}
}

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		try {
			c.setAge(12);
		} 
		catch (AgeException e) {
			System.err.println(e);
		}
	}
}
