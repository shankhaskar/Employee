package com.somitsolutions.java.Employee;

public class Engineer extends Employee {
	private String stream ;
	
	public Engineer() {
		super();
		stream = " ";
	}
	
	public Engineer( String fName , String lName , int age , String address , String stream  ) {
		super(fName ,lName , age , address );
		this.stream = stream;
		
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public void display() {
		super.display();
		System.out.println(stream);
	}
	
	public void inputData() {
		super.inputData();
		System.out.println("Enter stream");
		stream = in.nextLine();
	}

}
