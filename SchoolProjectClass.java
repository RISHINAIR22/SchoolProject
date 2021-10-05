package schoolProject;

import java.util.Scanner;

public class SchoolProjectClass {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private static int ID=1001;
	private String studentID;
	private String courses;
	private int tuitonBalance;
	private int costofCourse=600;
	
	public SchoolProjectClass() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's first name: ");
		this.firstName=sc.nextLine();
		
		System.out.println("Enter Student's last name: ");
		this.lastName=sc.nextLine();
		
		System.out.println("What grade year is the student: ");
		this.gradeYear=sc.nextInt();
		setstudentID();
		
		System.out.println(firstName+" " + lastName+" " +gradeYear+ " " +ID);
		
	}
	private String setstudentID() {
		ID++;
		//generate an ID for the student with combination of grade level+ID
		this.studentID= gradeYear+" " +ID;	
		return studentID;
	}
	public void enroll() {
		//creating a loop when user hits 0
		do {
		System.out.println("Enter course to enroll(Q to quit)");
		System.out.println("Available courses are: History, Mathematics, English, Computer Science, Chemistry");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		if(!course.equals("Q")) {
			courses= courses+"\n"+course;
			tuitonBalance=tuitonBalance+costofCourse;
		}
		else {
			System.out.println("break");
			break;
		}
		}while(1!=0);
		System.out.println("Enrolled in: "+ " "+courses);
		System.out.println("Tuiton balance: "+ " "+tuitonBalance);
	}
	public void viewBalance() {
		System.out.println("Your balance is:"+ " "+tuitonBalance);
		}
	public void payTuition() {
		System.out.println("How much would you like to pay?");
		Scanner sc=new Scanner(System.in);
		int Payment=sc.nextInt();
		tuitonBalance=tuitonBalance-Payment;
		System.out.println("Thank you for your payment of $ "+ Payment);
		viewBalance();
	}
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: "  + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " +  courses +
				"\n Balance : $ " +  tuitonBalance;
		}
}
