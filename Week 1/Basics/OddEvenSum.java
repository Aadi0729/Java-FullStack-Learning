package myProject;

public class OddEvenSum {
	public static void main(String[] args) {
		int i = 1;
		int sumEven = 0;
		int sumOdd = 0;
		
		while(i <= 5) {
			if(i%2 == 0)
					sumEven += i;
			else {
				sumOdd += i;
			}
			
			i++;
		}
		
		System.out.println("The sum of even numbers: "+sumEven);
		System.out.println("The sum of odd numbers: "+sumOdd);
	}
}
