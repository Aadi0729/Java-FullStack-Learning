package myProject;
import java.util.Scanner;

public class StudentClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of student: ");
		String name = s.nextLine();
		System.out.println("Enter the student roll number: ");
		long rollNo = s.nextLong();
		System.out.println("Enter the marks of subject 1: ");
		int marks1 = s.nextInt();
		System.out.println("Enter the marks of subject 2: ");
		int marks2 = s.nextInt();
		System.err.println("Enter the marks of subject 3: ");
		int marks3 = s.nextInt();
		
		// Display all details of student
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println("Subject 1 marks: " + marks1 + " Subject 2 marks: " + marks2 + " Subject 3 marks: " + marks3);
		
		int totalMarks = (marks1 + marks2 + marks3);
		System.out.println("Total marks = " + totalMarks);
		
		int avgMarks = totalMarks/3;
		System.out.println("Average marks = " + avgMarks);
	}

}
