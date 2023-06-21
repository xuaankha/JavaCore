package com.kha.chapter04_exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		try {
			myFunction(2, 4);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void myFunction(int number1, int number2) throws ArithmeticException, Exception {
		if (number2==0) throw new ArithmeticException("Lỗi chia cho 0");
		if (number2%2==0) throw new ArithmeticException("Lỗi chia cho số chẵn");
		System.out.println(number1 / number2);
		
	}

	private static void study005() {
		int number1 = 5;
		int number2 = 0;
		System.out.println("Nhan the ATM");

		try {
			System.out.println(number1 / number2);
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Tra the ATM");

	}
	// 2 loai exception: Runtime + Checked

	private static void study004() {
		// Runtime (unchecked): xảy ra khi thực chương trình
//		int number1 = 5;
//		int number2 = 0;
//		System.out.println(number1 / number2);

		// Checked:
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			FileOutputStream fileObj = new FileOutputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void study003() {
		int number1 = 5;
		int number2 = 0;
		// Case03: Thẻ ATM được nhả ra khi có lỗi giao dịch
		System.out.println("Nhan the ATM");
		try {
			System.out.println(number1 / number2);
		} finally {
			System.out.println("Tra the ATM");
		}

	}

	private static void study002() {
		int number1 = 5;
		int number2 = 0;
		// Case02: Thẻ ATM được nhả ra khi có lỗi giao dịch
		System.out.println("Nhan the ATM");
		try {
			System.out.println(number1 / number2);
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		System.out.println("Tra the ATM");

	}

	private static void study001() {
		int number1 = 5;
		int number2 = 0;
		// Case01: Thẻ ATM bị nhốt trong máy
		System.out.println("Nhan the ATM");
		System.out.println(number1 / number2);
		System.out.println("Tra the ATM");

	}

}
