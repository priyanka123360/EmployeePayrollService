package com.bridgelabz;

public class EmployeePayrollData {
	 
	private int emp_ID;
	private String emp_Name;
	private double salary;
	
	
	public EmployeePayrollData() {
		
	}

	public EmployeePayrollData(int emp_ID, String emp_Name, double salary) {
		super();
		this.emp_ID = emp_ID;
		this.emp_Name = emp_Name;
		this.salary = salary;
	}

	public int getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData [emp_ID=" + emp_ID + ", emp_Name=" + emp_Name + ", salary=" + salary + "]";
	}
	
	
	

}
