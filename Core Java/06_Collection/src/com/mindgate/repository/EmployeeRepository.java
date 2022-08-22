package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {

	private List<Employee> employeeList = new ArrayList<Employee>();

	public boolean addEmployee(Employee employee) {

		return employeeList.add(employee);
	}

	public List<Employee> getAllEmp() {

		return employeeList;

	}

	public Employee getEmployeeByEmployeeId(int employeeId) {

		for (Employee employee : employeeList) {

			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}

		}

		return null;

	}

	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {

			if (employee.getEmployeeId() == employeeId) {

				return employeeList.remove(employee);

			}

		}
		return false;
	}

	public boolean updateEmployee(Employee employee) {

		for (Employee employee1 : employeeList) {
			if (employee1.getEmployeeId() == employee.getEmployeeId()) {
				employee1.setName(employee.getName());
				employee1.setEmployeeId(employee.getEmployeeId());
				employee1.setSalary(employee.getSalary());
				return true;
			}

		}

		return false;

	}

}
