package com.cg.democollection.dao;

import java.util.LinkedList;
import java.util.List;

import com.cg.democollection.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee<Integer, Double>> myList = new LinkedList<Employee<Integer, Double>>();
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp) {
		// TODO Auto-generated method stub
		
		myList.add(emp);
		return emp;
	}

	public List<Employee<Integer, Double>> showEmployee() {
		// TODO Auto-generated method stub
		return myList;
	}
	
	
}
