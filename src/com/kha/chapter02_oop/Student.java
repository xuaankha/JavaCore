package com.kha.chapter02_oop;

public class Student extends Person {

	public Student(String name, String code, int birthday, double score) {
		super(name, code, birthday);
		this.score = score;
		// TODO Auto-generated constructor stub
	}

	public double score;

	public double getScrore() {
		return score;
	}

	public void setScrore(double scrore) {
		this.score = scrore;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Score:" + score);
	}

}
