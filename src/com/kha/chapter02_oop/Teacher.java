package com.kha.chapter02_oop;

public class Teacher extends Person {
	public Teacher(String name, String code, int birthday) {
		super(name, code, birthday);
	}

	public double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Salary:" + salary);
	}

}
