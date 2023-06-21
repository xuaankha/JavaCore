package com.kha.chapter01;

import java.util.Scanner;

public class bt_maytinhbotui {
	public static void main(String[] args) {
		int numberFirst;
		int numberSecond;
		String caculator;
		Scanner sc = new Scanner(System.in);

		System.out.println("Number First: ");
		numberFirst = sc.nextInt();
		sc.nextLine();

		System.out.println("Number Second: ");
		numberSecond = sc.nextInt();
		sc.nextLine();

		System.out.println("Caculator:");
		caculator = sc.nextLine();
		sc.close();

		System.out.println("numberFirst:" + numberFirst);
		System.out.println("numberSecond: " + numberSecond);
		System.out.println("Caculator:" + caculator);
		double result = 0;
		switch (caculator) {
		case "+":
			result = numberFirst + numberSecond;
			break;
		case "-":
			result=numberFirst-numberSecond;
			break;
		case "*":
			result=numberFirst*numberSecond;
		case "/":
			result=numberFirst/numberSecond;
		}
		System.out.println("Ket qua la:" + numberFirst + caculator + numberSecond+ "="+ result);
		
	}
}
