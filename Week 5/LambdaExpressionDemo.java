package lambdaexpression;

@FunctionalInterface
interface Phone {
	void call(int no);
}

/*
class ApplePhone implements Phone {

	@Override
	public void call() {
		System.out.println("Calling...");
	}
	
}
*/

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		/*
		Phone p = new ApplePhone();
		p.call();
		*/
		
		/* Anonymous Inner Class: Instead of creating a subclass which implements Phone only to override this call method
		I can even make use of Anonymous Inner Class */
		/*
		Phone p = new Phone() {
			public void call() {
				System.out.println("Calling...");
			}
		};
		p.call();
		*/
		
		// Using Lambda Expression: Already we know what is a method name to override why to mention the method name once again
		
		/*
		// CASE 1: No Argument
		Phone p = () -> {
				System.out.println("Calling...");
		};
		p.call();
		*/
		
		/*
		// CASE 2: Have Argument but need to mention data type once again
		Phone p = (int no) -> {
			System.out.println("Calling... "+no);
		};
		p.call(8888);
		*/
		
		/*
		// CASE 3: Have Argument but NO need to mention data type once again
		Phone p = (no) -> {
			System.out.println("Calling... "+no);
		};
		p.call(8888);
		*/
		
		// CASE 4: Have Argument but need to mention data type once again ALSO the parenthesis is not required when the method is taking only one argument
		Phone p = no -> {
			System.out.println("Calling... "+no);
		};
		p.call(8888);
	}
}
