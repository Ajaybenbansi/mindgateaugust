package com.mindgate.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {

	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "system";
	private String password = "mindgate123";
	private Connection connection;
	private PreparedStatement preparedStatement;
	private List<Employee> EmployeeList;
	private ResultSet resultSet;

	private static final String INSERT_EMPLOYEE = "insert into employee_details values(?,?,?)";
	private static final String SELECT_ALL_EMPLOYEE = "select * from employee_details";
	private static final String DELETE_EMPLOYEE="delete from employee_details where employee_id=?";
	private static final String UPDATE_EMPLOYEE="update employee_details SET Name=? where employee_id=?";
	@Override
	public boolean addNewEmployee(Employee employee) {

		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());

			int insertCount = preparedStatement.executeUpdate();

			if (insertCount > 0) {
				return true;

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {

		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
			resultSet = preparedStatement.executeQuery();

			EmployeeList = new ArrayList<>();
			while (resultSet.next()) {
				int employeeId = resultSet.getInt("EMPLOYEE_ID");
				String name = resultSet.getNString("NAME");
				double salary = resultSet.getDouble("SALARY");

				Employee employee = new Employee(employeeId, name, salary);
				EmployeeList.add(employee);

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return EmployeeList;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
			preparedStatement.setInt(1, employeeId);

			int insertCount = preparedStatement.executeUpdate();

			if (insertCount > 0) {
				return true;

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public boolean updateEmployee(String name, int employeeId) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
			
			preparedStatement.setInt(2, employeeId);
			preparedStatement.setString(1, name);

			int insertCount = preparedStatement.executeUpdate();

			if (insertCount > 0) {
				return true;

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		return false;
	}

	@Override
	public List<Employee> getOneEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
}
