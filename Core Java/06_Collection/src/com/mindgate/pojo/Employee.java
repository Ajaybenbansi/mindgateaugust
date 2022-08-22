package com.mindgate.pojo;

import java.util.Objects;

public class Employee {
	
	private int employeeId;
	private String name;
	private double salary;
	
	 
	
@Override
	public int hashCode() {
	System.out.println("use hashcode");
		return Objects.hash(employeeId, name, salary);
	}




	@Override
	public boolean equals(Object obj) {
		
		System.out.println("use equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}




public Employee() {
	
}




public Employee(int employeeId, String name, double salary) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.salary = salary;
}







public int getEmployeeId() {
	return employeeId;
}




public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public double getSalary() {
	return salary;
}




public void setSalary(double salary) {
	this.salary = salary;
}




@Override
public String toString() {
	return "Employee [emloyeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
}




	

}