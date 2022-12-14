package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;
import com.mindgate.repository.EmployeeRepositoryInterface;

public class EmployeeService implements EmployeeServiceInterface {

	private EmployeeRepositoryInterface employeeRepositoryInterface = new  EmployeeRepository();
	@Override
	public boolean addNewEmployee(Employee employee) {
		
		System.out.println("in service");
		
		return employeeRepositoryInterface.addNewEmployee(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		System.out.println("in service");
		return employeeRepositoryInterface.getAllEmployee();
	}
	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.deleteEmployeeByEmployeeId(employeeId);
	}
	@Override
	public boolean updateEmployee(String name, int employeeId) {
		System.out.println("in service");
		return employeeRepositoryInterface.updateEmployee(name, employeeId);
	}
	

	

}
