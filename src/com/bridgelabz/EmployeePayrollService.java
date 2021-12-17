package com.bridgelabz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService {
		CONSOLE_IO, FILE_IO, REST_IO
	}

	private List<EmployeePayrollData> EmployeePayrollList;

	EmployeePayrollService(List<EmployeePayrollData> EmployeePayRollList) {
		this.EmployeePayrollList = EmployeePayRollList;
	}

	public static void main(String[] args) {
		List<EmployeePayrollData> EmployeePayRollList = new ArrayList<>();
		EmployeePayrollService employeePayRollService = new EmployeePayrollService(EmployeePayRollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayRollService.readEmployeePayRollData(consoleInputReader);
		employeePayRollService.writeEmployeePayRollData();
	}

	private void writeEmployeePayRollData() {
		System.out.println("\nWriting Employee Payroll Roaster to console\n"+ EmployeePayrollList);
	}

	private void readEmployeePayRollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID:");
		int id=consoleInputReader.nextInt();
		System.out.println("Enter Employee Name:");
		String name=consoleInputReader.next();
		System.out.println("Enter Employee Salary");
		double salary=consoleInputReader.nextDouble();
		EmployeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}
}
