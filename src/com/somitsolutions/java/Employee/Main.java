package com.somitsolutions.java.Employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1 , 2 and 3 for Doctor , Engineer and Teacher....");
		
		Scanner in = new Scanner (System.in);
		
		int choice = in.nextInt();
		
		Employee doctor = new Doctor();
		Employee engg = new Engineer();
		Employee teacher = new Teacher();
		
		switch(choice) {
		case 1 :
			doctor.inputData();
			doctor.display();
			break;
			
		case 2 :
			engg.inputData();
			engg.display();
			break;
			
		case 3 :
			teacher.inputData();
			teacher.display();
			break;
		}

	

      }
	
	
	
}
	
