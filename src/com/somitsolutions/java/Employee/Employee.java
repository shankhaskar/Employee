package com.somitsolutions.java.Employee;

import java.util.Scanner;

public class Employee {
	
	Scanner in = new Scanner(System.in);
	private String firstName ;
	private String lastName ;
	private int age ;
	private String address ;
	
	public Employee () {
		
		firstName  = " " ;
		lastName  =  " " ;
		age = 0 ;
		address = " " ;
	
	}
	
	public Employee ( String fName , String lName , int age , String address) {
		this.firstName = fName ;
		this.lastName = lName ;
		this.age = age;
		this.address = address ;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display () {
		System.out.println("First Name : " + firstName );
		System.out.println("Last name : " + lastName);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
	}
	
	public void inputData () {
		System.out.println("Enter first name ");
		firstName = in.nextLine();
		
		System.out.println("Enter last name");
		lastName = in.nextLine();
		
		System.out.println("Enter age");
		age = Integer.parseInt(in.nextLine());
		
		System.out.println("Enter address");
		address = in.nextLine();
		
		
	}

}
