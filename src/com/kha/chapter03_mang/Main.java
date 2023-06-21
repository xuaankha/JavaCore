package com.kha.chapter03_mang;

public class Main {
	public static void main(String[] args) {
		Student studentOne = new Student();
		Student studentTwo = new Student();
		studentOne.birtday = 1944;
		studentOne.code = "19110";
		studentOne.name = "Kha";
		System.out.println("Name:" + studentOne.name);
		System.out.println("Code:" + studentOne.code);
		System.out.println("Birtday:" + studentOne.birtday);
		
		studentTwo.birtday = 1944;
		studentTwo.code = "191102344";
		studentTwo.name = "Oanh";
		System.out.println("Name:" + studentTwo.name);
		System.out.println("Code:" + studentTwo.code);
		System.out.println("Birtday:" + studentTwo.birtday);
		

	}
}
