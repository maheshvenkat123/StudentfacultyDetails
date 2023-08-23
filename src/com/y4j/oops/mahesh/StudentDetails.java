package com.y4j.oops.mahesh;

public class StudentDetails {

	String fName;
	String lName;
	String email;
	int age;
	long phno;
	int subMarks[];
	
	StudentDetails(String fName, String lName, String email, int age, long phno, int subMarks[]){
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.age = age;
		this.phno = phno;
		this.subMarks = subMarks;
	}
	
	void studentsDetails() {
		System.out.println("Student details");
		System.out.println("Student fullname is: " +fName +" " +lName);
		System.out.println("EmailID is: " +email);
		System.out.println("Age is: " +age);
		System.out.println("phone number is: " +phno);
		
		int totalMarks = 600;
		int totalMarksGained = 0;
		
		for(int i=0;i<subMarks.length;i++) {
			totalMarksGained += subMarks[i]; 
		}
		
		float calculatePercentage(int totalMarksGained, int totalMarks) {
			float percentage = (float)(totalMarksGained / totalMarks) * 100;
			
			return percentage;
		}
		
		int calculateageinMonths() {
			int ageinMonths = age * 12;
			return ageinMonths;
		}
}
