package com.somitsolutions.java.Employee;

public class Doctor extends Employee {
	private String clinic;
	private String specialization;
	
	public Doctor() {
		super();
		this.clinic = " " ;
		this.specialization = " " ;
	}
	
	public Doctor(String fName , String lName , int age , String address ,String clinic , String spec ) {
		super(fName , lName, age , address  );
		this.clinic = clinic ; 
		this.specialization = spec ;
	}
	
	
	
	public String getClinic() {
		return clinic;
	}
	public void setClinic(String clinic) {
		this.clinic = clinic;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	// overriding
	
	public void display() {
		super.display();
		System.out.println("Clinic : " + clinic);
		System.out.println("Specailization : " + specialization);
	}
	
	public void inputData() {
		super.inputData();
		System.out.println("Enter clinic");
		clinic = in.nextLine();
		
		System.out.println("Enter specialization");
		specialization = in.nextLine();
	}

}
