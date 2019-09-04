package com.cg.democollection.service;

import java.util.List;

import com.cg.democollection.dto.Employee;

public interface EmployeeService {
	
	public Employee<Integer,Double> addEmployee(Employee<Integer, Double> emp);
	public List<Employee<Integer,Double>> showEmployee();

}
