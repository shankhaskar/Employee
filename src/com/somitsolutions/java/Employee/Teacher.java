package com.somitsolutions.java.Employee;

public class Teacher extends Employee {
	
	private String Subject ;
	private String School;
	
	public Teacher () {
		super();
		this.Subject = " ";
		this.School = " ";
		
		
	}
	
	public Teacher (String fName , String lName , int age , String address , String Subject , String School ) {
		super(fName , lName , age , address);
		this.Subject = Subject;
		this.School = School;
	}
	
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String Subject) {
		this.Subject = Subject;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
	
	public void display() {
		super.display();
		System.out.println("Subject : " + Subject);
		System.out.println("School : " + School);
	}
	
	public void inputData() {
		super.inputData();
		System.out.println("Enter subject ");
		Subject = in.nextLine();
		
		System.out.println("Enter School ");
		School = in.nextLine();
	}


}
