package com.cg.democollection.dto;

import java.util.Comparator;






public class Employee<T,K> implements Comparable<Employee<T,K>> {
	
	public int compareTo(Employee<T,K> o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}

	

	T empId;
	String empName;
	K empSalary;
	
	public Employee()
	{
		
	}

	public Employee(T empId, String empName, K empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public T getEmpId() {
		return empId;
	}

	public void setEmpId(T empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public K getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(K empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result
				+ ((empSalary == null) ? 0 : empSalary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSalary == null) {
			if (other.empSalary != null)
				return false;
		} else if (!empSalary.equals(other.empSalary))
			return false;
		return true;
	}
	
	public static class SortBySalary implements Comparator<Employee<Integer,Double>>
	{
		public int compare(Employee<Integer,Double> empOne,Employee<Integer, Double> empTwo)
		{
			if(empOne.getEmpSalary() > empTwo.getEmpSalary()) return 1;
	        if(empOne.getEmpSalary() < empTwo.getEmpSalary()) return -1;
	        return 0;
		}
	}
	
}
