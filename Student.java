package studentdatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionFee=0;
	private static int costOfCourse=600;
	private static int id=1000;
	
	
	// constructor: prompt to enter student's name and year
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter your last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - freshman\n2 - sophmore\n3 - junior\n4 - senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		setStudentID();
		// System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
	}
		
	// generate a unique ID
	private void setStudentID(){
		id++;
		// gradeYear+ID
		this.studentID =  gradeYear+""+id;
	}
	
	// enroll in courses
	public void enroll() {
		// get inside a inner loop, user hits 0
		do {
			System.out.print("ENTER COURSE TO ENROLL(Q FOR QUIT): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses+"\n "+course;
				tuitionFee = tuitionFee+costOfCourse;
			}
			else{ break; }
		}while(1!=0);
		
 		  
		// System.out.println("Enroll in: "+courses);
		System.out.println("Tuitionfee: "+tuitionFee);
	}
	
	// view their balance
	public void viewBalance() {
		System.out.println("Your balance is : $"+tuitionFee);
	}
	
	// view their pays
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionFee = tuitionFee - payment;
		System.out.println("Thank you for payment of $"+payment);
		viewBalance();
	}
	
	// view student's status
	public String toString() {
		return "Name: "+firstName+" "+lastName+
				"\nGrade level: "+gradeYear+
				"\nStudent ID: "+studentID+
				"\nEnrolled courses"+courses+
				"\nView Balance: $"+tuitionFee;
	}
	
	
	

}
