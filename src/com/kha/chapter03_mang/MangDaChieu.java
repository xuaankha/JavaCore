package com.kha.chapter03_mang;

import java.util.Iterator;

public class MangDaChieu {
	public static void main(String[] args) {
		study002();
	}

	public static void study001() {
		int[][] arrMulti = new int[2][3];
		// Hàng thứ nhất row = 0
		arrMulti[0][0] = 2;
		arrMulti[0][1] = 9;
		arrMulti[0][2] = 1;
		// Hàng thứ hai row =1
		arrMulti[1][0] = 3;
		arrMulti[1][1] = 6;
		arrMulti[1][2] = 7;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(+arrMulti[i][j] + " \t");
			}
			System.out.println("\n");
		}
	}

	public static void study002() {
		int[][] matrix = new int[3][3];

		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		//Truy cập phần tử của mảng bằng chỉ số hàng và chỉ số cột:
		int value = matrix[1][1];
		System.out.println("Value = " +value);
		//Thay đổi giá trị của phần tử trong mảng:
		matrix[2][2] = 9;
		//Duyệt các phần tử của mảng bằng vòng lặp for:
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print( +matrix[i][j] +"\t");
		    }
		    System.out.println("\n");
		}
	}
}
