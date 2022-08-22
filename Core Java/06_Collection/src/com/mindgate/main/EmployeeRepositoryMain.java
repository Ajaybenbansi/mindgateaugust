package com.mindgate.main;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;

public class EmployeeRepositoryMain {

	public static void main(String[] args) {

		EmployeeRepository empr = new EmployeeRepository();
		Employee employee1 = new Employee(101, "ajay", 10000);
		Employee employee2 = new Employee(102, "vijay", 10000);
		Employee employee3 = new Employee(103, "jay", 10000);

		empr.addEmployee(employee1);
		empr.addEmployee(employee2);
		empr.addEmployee(employee3);
		System.out.println("before delete:::");
		List<Employee> emp = empr.getAllEmp();

		for (Employee employee : emp) {
			System.out.println(employee);
		}

		System.out.println();

		Employee eml = empr.getEmployeeByEmployeeId(103);
		System.out.println(eml);
		System.out.println();
		System.out.println(" after Delete:::");

		boolean result = empr.deleteEmployeeByEmployeeId(103);

		emp = empr.getAllEmp();

		for (Employee employee : emp) {
			System.out.println(employee);
		}

		Employee upemployee = new Employee(102, "sanju", 50000);

		System.out.println("before update:::");
		List<Employee> emp2 = empr.getAllEmp();
		
		for (Employee employee : emp2) {
			System.out.println(employee);
		}
		System.out.println("after update:::");
		boolean result1 = empr.updateEmployee(upemployee);
		List<Employee> emp21 = empr.getAllEmp();
		
		for (Employee employee : emp21) {
			System.out.println(employee);
		}
		
		
	}
}
