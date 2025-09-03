package myProject;
import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		double radius = s.nextDouble();
		double pi = 3.14;
		double area = pi * radius * radius;
		
		System.out.println("The area of a circle is: "+area);
	}

}
