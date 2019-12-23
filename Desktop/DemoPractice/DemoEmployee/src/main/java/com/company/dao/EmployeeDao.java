package com.company.dao;

import java.util.List;

import com.company.domain.Employee;

public interface EmployeeDao {

	int saveEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int id);
	Employee findEmployeeById(int id);
	List<Employee> findAllEmployee();
}
