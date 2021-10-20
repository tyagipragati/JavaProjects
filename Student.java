package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int batchYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costofCourse = 500;
	private static int id = 1000;
	
	
	//Constructor: Prompt Student name and year
	public Student () {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student's First Name: ");
		firstName = in.nextLine();
		
		;
		System.out.print("Enter Student's Last Name:");
		lastName = in.nextLine();
		
		
		System.out.print("Enter Batch Year: ");
		batchYear = in.nextInt();
		setStudentID();
		System.out.print(firstName + " " + lastName + " " + batchYear + " " + studentID);

	}
	
	//generate ID
	private void setStudentID() {
		id++;
		this.studentID = batchYear + "" +  id;
	}

	//Enroll in courses
	public void enroll() {
		do {
			System.out.print(" Enter course to enroll (Q to quit) ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
				if (!course.equals("Q")) {
					courses = course + "\n" + courses;
					tuitionBalance = tuitionBalance + costofCourse;
				}	else {	break;
					
						}
			} while ( 1 != 0);
				
				//System.out.print("Enrolled in: " + courses);
				//System.out.print("TuitionBalance: " + tuitionBalance);
				
	}
	
	//view balance and pay tuition
	public void viewBalance() {
			System.out.print(" Total Balance is $" + tuitionBalance);
	}
	public void payTuition() {
			viewBalance();
			System.out.println(" Enter your payment: ");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance - payment;
			System.out.print(" Thank you for your payment of $ " + payment);
			viewBalance();
			
	}
	public String showInfo() {
		return 	" Name: " + firstName + "" + lastName +
				"\nCourses Enrolled: " + courses +
				"\nBatchYear:" + batchYear +
				"\nstudent ID:" + studentID +
				"\nBalance: $" + tuitionBalance;
	}
}//print status of student
