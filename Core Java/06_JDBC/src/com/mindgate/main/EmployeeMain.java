package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter employeeId");
		int EmployeeId= scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter name");
		String name=scanner.next();
		System.out.println("enter salary");
		double salary= scanner.nextDouble();
		
		EmployeeServiceInterface employeeServiceInterface= new EmployeeService();
		Employee employee = new Employee(EmployeeId, name, salary);
		boolean result = employeeServiceInterface.addNewEmployee(employee);
		if (result) {
			System.out.println("insert Successfully!");
		}else {
			System.out.println("insert Failed!");
		}
	
		
	}

}
