package studentdatabaseApp;

import java.util.Scanner;

public class studentDatabaseApp {
	public static void main(String[] args) {
		


		
		// how many student we want to add
		System.out.println("Enter the no of student you want to add: ");
		Scanner in = new Scanner(System.in);
		int noOfStudent = in.nextInt();
		Student[] students = new Student[noOfStudent];
		
		
		// create n number of student 
		for(int n=0; n<noOfStudent; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
		for(int n=0; n<noOfStudent; n++) {
			System.out.println(students[n].toString());
			
		}
		
		
	}

}
