package schoolProject;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		SchoolProjectClass stud1=new SchoolProjectClass();
		stud1.enroll();
		stud1.payTuition();
		System.out.println(stud1.toString());
		System.out.println("Enter the # of new students to enroll");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SchoolProjectClass[] students=new SchoolProjectClass[n];
		for(int x=0;x<n;x++) {
			students[x]=new SchoolProjectClass();
			students[x].enroll();
			students[x].payTuition();
			System.out.println(students[x].toString());
		}
		}
	}

