package com.kha.chapter03_mang;

import java.util.Arrays;

public class Mang1 {
	public static void main(String[] args) {
		casestudy005();
	}

	private static void casestudy005() {
		// Sắp xếp mảng theo thứ tư tăng dần
		int numbers[] = { 0, 1, 7, 9, 12, 2, 3, 4 };
		Arrays.sort(numbers);
		System.out.println("Mang sau khi sort:" + Arrays.toString(numbers));

	}

	private static void casestudy004() {
		// Tìm max
		int numbers[] = { 0, 1, 2, 3, 4 };
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Phan tu lon nhat trong mang: " + max);

	}

	private static void casestudy003() {
		// Tính tổng các phần tử trong mảng
		int numbers[] = { 0, 1, 2, 3, 4 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Tong cac phan tu trong mang: " + sum);

	}

	public static void casestudy001() {
		// Khai báo một mảng
		int[] numbers = new int[5];
		int numbers1[];
		int[] numbers2;
		// Khởi tạo giá trị cho mảng
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		// Truy cập giá trị của phần tử trong mảng:
		System.out.println(numbers[0]); // In ra 1
		System.out.println(numbers[1]); // In ra 2
		System.out.println(numbers[2]); // In ra 3
		System.out.println(numbers[3]); // In ra 4
		System.out.println(numbers[4]); // In ra 5
	}

	private static void casestudy002() {
		// Sử dụng vòng lặp for để duyêt qua các phần tử trong mảng
		int numbers[] = { 0, 1, 2, 3, 4 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
