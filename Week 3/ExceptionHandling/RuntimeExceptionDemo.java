package week3;

public class RuntimeExceptionDemo {
	public static void main(String[] args) {
		//ArithmeticException
		/*int n = 10/0;*/
		//ArrayIndexOutOfBoundsException
		/*int[] n = {10,20,30,40,50};
		System.out.println(n[9]);*/
		//StringIndexOutOfBoundsException
		/*String s = "Welcome";
		System.out.println(s.charAt(10));*/
		//NegativeArraySizeException
		/*int[] n = new int[-5];*/
		//NumberFormatException
		/*String str = "abc";
		int n = Integer.parseInt(str); */
		//NullPointerException
		String str = null;
		System.out.println(str.equals("Apple"));
	}
}
