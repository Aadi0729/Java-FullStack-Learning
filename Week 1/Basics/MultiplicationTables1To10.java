package myProject;

public class MultiplicationTables1To10 {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 10) {
			
			for(int j=1; j<=10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
			i++;
		}
	}
}
