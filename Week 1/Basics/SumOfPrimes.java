package myProject;

import java.util.Scanner;

public class SumOfPrimes {
	public static void main(String[] args) {
		
		int i=2, sum=0;
		
		while(i<=100) {
			
			int flag = 1;
			
			int j;
			for(j=2; j<=i-1; j++) {
				if(i%j == 0) {
					flag = 0;
					break;
				}
			}
			
			if(flag == 1) {
				sum += i;
				i++;
			}
			else {
				i++;
			}
		}
		
		System.out.print("The sum of primes from 2 to 100: "+sum);
	}
}
