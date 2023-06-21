package com.kha.chapter01;

public class p02_variable {
	public static void main(String[] args) {
		//Khai báo biến
//		int age;
//		char name;
//		int year;
//		char city;
		int age, year;
		char name, city;
		//3 cách đặc cầu thường gặp
		//first name
		char firstname; //normal
		char firstName; //camelCase
		char first_name;//underscores
		/*
		 * 
		 * Ctr + / để comment nhanh 
		 * Ctr + D để xoá nhanh 1 dòng
		 nhé ok>?
		 * */
		 age=30; year=1993;
		 name='K';
		 city='A';
		System.out.println("age=" + age );
		System.out.println("year=" + year);
		//Hằng số
		final int YOUR_BIRTHDAY=2001;
		System.out.println(YOUR_BIRTHDAY);
		
		//Datatype
		
		//Khai báo
				int var1=12;
				int var2=200;
				boolean var3=false;
				double var4=12.22;;
				String name1="aHK";
				//Kiểm tra kết quả
				System.out.println(var1);
				System.out.println(var2);
				System.out.println(var3);
				System.out.println(var4);
				System.out.println(name);
				//Có 2 kiểu chuyển đổi dữ liệu (ép kiểu)
				/*
				 * -Nới rộng (widening): chuyển kdl có kích thước nhỏ 
				sang lớn (không làm mất thông tin)
				-Thu hẹp (narrowwing): chuyển đổi kiểu có kích thước lớn
				sang nhỏ (làm mất thông tin)
				*/
				int wide=12;
				double narrow=1.23;
				int a= wide + (int)narrow;
				double b= (double)wide + narrow;
				System.out.println(a);
				System.out.println(b);
	}
}
