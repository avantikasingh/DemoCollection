package com.cg.democollection.service;

import java.util.List;

import com.cg.democollection.dao.EmployeeDao;
import com.cg.democollection.dao.EmployeeDaoImpl;
import com.cg.democollection.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao=new EmployeeDaoImpl();

	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public List<Employee<Integer, Double>> showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}
	

}
