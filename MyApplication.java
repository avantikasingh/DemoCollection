package com.cg.democollection.ui;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cg.democollection.dto.Employee;
import com.cg.democollection.service.EmployeeService;
import com.cg.democollection.service.EmployeeServiceImpl;

public class MyApplication<T> {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		EmployeeService service=new EmployeeServiceImpl();
		int choice;

		do {
			printDetail();
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Employee ID");
				Integer id = sc.nextInt();
				System.out.println("Enter Employee Name");
				String name = sc.next();
				System.out.println("Enter Employee Salary");
				Double sal = sc.nextDouble();

				Employee<Integer, Double> emp = new Employee<Integer, Double>();

				emp.setEmpId(id);
				emp.setEmpName(name);
				emp.setEmpSalary(sal);

				service.addEmployee(emp);

				break;

			case 2:
				List<Employee<Integer, Double>> myList=service.showEmployee();
				Collections.sort(myList,new Employee.SortBySalary());
				for (Employee<Integer, Double> e : myList) {
					System.out.println(e);
				}
				break;
			case 3:
				sc.close();
				System.exit(0);

			}

		} while (choice != 2);

	}

	public static void printDetail() {
		System.out.println("Enter:");
		System.out.println("1 Add");
		System.out.println("2 Show");
		System.out.println("3 Exit");
	}
}
