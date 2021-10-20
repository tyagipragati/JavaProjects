package studentdatabaseapp;

import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {
		
		
	
		
		//How many students we need to add
		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numofStudents = in.nextInt();
		Student[] students = new Student [numofStudents];
		
		for (int n=0; n< numofStudents ; n++) {
			Student stu = new Student();
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			
		}
		for (int n=0; n< numofStudents ; n++) {
		System.out.print(students[n].showInfo());
		// Create n number of new students
	}
}
