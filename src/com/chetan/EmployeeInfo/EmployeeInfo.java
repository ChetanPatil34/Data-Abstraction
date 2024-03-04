package com.chetan.EmployeeInfo;
import java.util.Scanner;
public class EmployeeInfo {

	


		EmploeeModel employeeinfo = new EmploeeModel();

		public void setEmployee() {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the Employee ID:");
			employeeinfo.setEid(scanner.nextInt());
			System.out.println("Enter the Employee Name:");
			employeeinfo.setEname(scanner.next());
			System.out.println("Enter the Employee Mobile No:");
			employeeinfo.setMobileNo(scanner.next());
			System.out.println("Enter the Employee Salary");
			employeeinfo.setSalary(scanner.nextDouble());
		}

		public void getEmployee() {
			System.out.println("Employee ID:"+employeeinfo.getEid());
			System.out.println("Employee Name:"+employeeinfo.getEname());
			System.out.println("Employee Mobile No:"+employeeinfo.getMobileNo());
			System.out.println("Employee Salary:"+employeeinfo.getSalary());
		}

		public static void main(String[] args) {
			EmployeeInfo employeeinfo = new EmployeeInfo();
			employeeinfo.setEmployee();
			employeeinfo.getEmployee();
		}

	}
		


