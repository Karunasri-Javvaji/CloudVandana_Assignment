package com.demo.programs;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("ID: " + id + ", NAME: " + name + ", SALARY: " + salary);
	}
}

public class EmployeeDetails {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Ram", 50000));
		employees.add(new Employee(2, "Dev", 60000));
		employees.add(new Employee(3, "sweety", 70000));

		for (Employee emp : employees) {
			emp.displayDetails();
		}
	}
}
