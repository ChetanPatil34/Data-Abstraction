package com.chetan.StudentImfo;
import java.util.Scanner;

public class StudentImfo {
	
	
	StudentModel studentmodel = new StudentModel();
	
	public void setData() 
	
	{
		   Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Student Id:");
			studentmodel.setSid(scanner.nextInt());
			
			System.out.println("Enter the Student Name:");
			studentmodel.setSName(scanner.next());
			
			System.out.println("Enter the Student Mobile No:");
			studentmodel.setMobileNo(scanner.next());
			
			System.out.println("Enter the Student Fees :");
			studentmodel.setFees(scanner.nextDouble());
		}
	
	public void getData() {
		System.out.println("Student Id:"+studentmodel.getid());
		System.out.println("Student Name:"+studentmodel.getName());
		System.out.println("Student Mobile No:"+studentmodel.getMobileNO());
		System.out.println("Student Fees:"+studentmodel.getFees());
		
	}
	

	public static void main(String[] args) {
		StudentImfo studentinfo = new StudentImfo();
		
		studentinfo.setData();
		studentinfo.getData();
		

	}

}
