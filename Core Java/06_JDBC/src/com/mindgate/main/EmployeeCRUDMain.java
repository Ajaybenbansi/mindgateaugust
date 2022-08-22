package com.mindgate.main;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		List< Employee> allemployee;
		EmployeeServiceInterface employeeServiceInterface= new EmployeeService();
		String countinueChoice;
		int	EmployeeId;
		String name;
		double salary;
		boolean result;
		
		do { System.out.println("Enter 1:: Add new Employee");
		System.out.println("Enter 2:: Update Employee");
		System.out.println("Enter 3:: Delete Employee");
		System.out.println("Enter 4:: Select one Employee");
		System.out.println("Enter 5:: Select All Employee");
		
		
	Scanner scanner =new Scanner(System.in);
		 int choice= scanner.nextInt();
		 scanner.nextLine();
		 switch (choice) {
		case 1:	{
		System.out.println("enter employeeId");
		EmployeeId= scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter name");
		 name=scanner.next();
		System.out.println("enter salary");
		 salary= scanner.nextDouble();
		
		
		Employee employee = new Employee(EmployeeId, name, salary);
		 result = employeeServiceInterface.addNewEmployee(employee);
		if (result) {
			System.out.println("insert Successfully!");
		}else {
			System.out.println("insert Failed!");
		}
		}
			break;
			case 5: {
				allemployee= employeeServiceInterface.getAllEmployee();
				for(Employee e: allemployee) {
					System.out.println(e);
				}
				
			break;
			}
			case 3:{
				System.out.println("Enter employeeId");
				EmployeeId =scanner.nextInt();
				result=employeeServiceInterface.deleteEmployeeByEmployeeId(EmployeeId);
				if (result) {
					System.out.println("Delete Successfully!");
				}else {
					System.out.println("Delete Failed!");
				}
				break;
			}
			case 2:	{
				System.out.println("enter employeeId");
				EmployeeId= scanner.nextInt();
				scanner.nextLine();
				System.out.println("set name");
				 name=scanner.next();
				
				
				scanner.nextLine();
				 result = employeeServiceInterface.updateEmployee(name, EmployeeId);
				if (result) {
					System.out.println("updated Successfully!");
				}else {
					System.out.println("update Failed!");
				}break;
				}
			
			
			
		 	
	
		default:
			System.out.println("enter valid choice");
			break;
		 }
			
			System.out.println("do you want to countinue");
			countinueChoice=scanner.next();
		
		}
	while(countinueChoice.equals("yes"));
	}
		
		
		
		
	}
	


