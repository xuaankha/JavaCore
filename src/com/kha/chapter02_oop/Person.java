package com.kha.chapter02_oop;

public class Person {
	public String name;

	public Person(String name, String code, int birthday) {
		this.name = name;
		this.code = code;
		this.birthday = birthday;
	}

	public String code;
	public int birthday;

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	// Show student Info
	public void showInfo() {
		System.out.println("====================================");
		System.out.println("Name:" + name);
		System.out.println("Code:" + code);
		System.out.println("Birthday:" + birthday);

	}

}
