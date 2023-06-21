package com.kha.chapter03_mang;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;
public class Mang {
	public static void main(String[] args) {
		casestudy005();
	}

	public static void casestudy001() {
		// Khai bao mang
		int arrOne[];
		int[] arrTwo;
		// Khai bao mang va cap vung nho
		int[] arrInt = new int[5];
		arrInt[0] = 30;
		arrInt[1] = 31;
		arrInt[2] = 32;
		arrInt[3] = 33;
		arrInt[4] = 34;

		System.out.println("Phần tử thứ 1:" + arrInt[0]);
		System.out.println("Phần tử thứ 2:" + arrInt[1]);
		System.out.println("Phần tử thứ 3:" + arrInt[2]);
		System.out.println("Phần tử thứ 4:" + arrInt[3]);
		System.out.println("Phần tử thứ 5:" + arrInt[4]);
	}

	public static void casestudy002() {
		int[] arrInt = { 30, 31, 32, 33, 34, 35, 36, 37 };
		for (int i = 0; i <= 4; i++) {
			System.out.println("Phần tử thứ " + i + ":" + arrInt[i]);
		}
	}

	public static void casestudy003() {
		int[] arrInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println("Phần tử đầu tiên của mảng là: " + arrInt[0]);
		System.out.println("Tổng số phần tử: " + arrInt.length);
		System.out.println("Phần tử cuối cùng của mảng là: " + arrInt[arrInt.length - 1]);
		System.out.println("Phần tử ở giữa của mảng là: " + arrInt[(arrInt.length - 1) / 2]);
		// In ra tat ca cac phan tu cua mang
		int length = arrInt.length;
		for (int i = 0; i < length; i++) {
			System.out.printf("Phần tử thứ %d: %d %n", i, arrInt[i]);
		}
		// Cach khac
		for (int n : arrInt) {
			System.out.println(n);
		}
	}

	public static void casestudy004() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length: ");
		int length = sc.nextInt();
		sc.nextLine();
		int[] arrNumber = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.printf("Phần tử thứ %d: %n", i);
			arrNumber[i] = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
		for (int i = 0; i < length; i++) {
			System.out.printf("Phần tử thứ %d: %d %n", i, arrNumber[i]);
		}
	}

	public static void casestudy005() {
		int[] arrInt = { 7, 2, 43, 4, 15 };
		int sum = 0;
		int min = arrInt[0];
		int max = arrInt[0];
		// Dài dòng
		/*
		 * for (int i = 0; i < 5; i++) { if (min > arrInt[i]) { min = arrInt[i]; } } for
		 * (int i = 0; i < 5; i++) { if (max < arrInt[i]) { max = arrInt[i]; } } for
		 * (int i = 0; i < 5; i++) { sum = sum + arrInt[i]; }
		 * System.out.println("Min = " + min); System.out.println("Max = " + max);
		 * System.out.println("Sum =" + sum);
		 */
		// Ngắn hơn
		/*
		 * for (int i = 0; i < 5; i++) { if (min > arrInt[i]) min = arrInt[i]; if (max <
		 * arrInt[i]) max = arrInt[i]; sum = sum + arrInt[i]; }
		 * System.out.println("Min = " + min); System.out.println("Max = " + max);
		 * System.out.println("Sum =" + sum);
		 */
		// Cach dung for khac
		for (int number : arrInt) {
			if (min > number)
				min = number;
			if (max < number)
				max = number;
			sum = sum + number;
		}
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		System.out.println("Sum =" + sum);
		System.out.println("ToString: "+ Arrays.toString(arrInt));
	}
	
	

}
