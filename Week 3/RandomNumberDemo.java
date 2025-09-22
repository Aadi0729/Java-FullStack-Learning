package week3;

public class RandomNumberDemo {
	public static void main(String[] args) {
		System.out.println("Random Number = "+Math.random());
		System.out.println("Four digits OTP = "+(int)(Math.random()*10000));
		System.out.println("Six digits OTP = "+(int)(Math.random()*1000000));
	}
}
