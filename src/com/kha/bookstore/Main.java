package com.kha.bookstore;

import java.util.Scanner;

public class Main {
	private static Store storeObj = new Store();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int functionID = 0;
		boolean flag = true;
		do {
			showMenu();
			try {
				functionID = sc.nextInt();
				sc.nextLine();
				switch (functionID) {
				case 1:
					addBook();
					break;
				case 2:
					editBook();
					break;
				case 3:
					deleteBook();
					break;
				case 4:
					findBook();
					break;
				case 5:
					listBook();
					break;
				case 6:
					exitApp();
					break;
				default:
					flag = false;
					break;
				}
			} catch (Exception e) {
				myPrint("Error Please try again!");
				flag = true;
				sc.nextLine();
			}

		} while (flag = true);
		sc.close();
	}

	public static void exitApp() {
		System.exit(0);

	}

	public static void listBook() {
		// TODO Auto-generated method stub
		storeObj.list();
	}

	public static void findBook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bookID = "";
		myPrint("ID:");
		bookID = sc.nextLine();
		storeObj.find(bookID);

	}

	public static void editBook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bookName = "";
		String bookID = "";
		double bookPrice = 0;
		String tacGia = "";
		myPrint("ID:");
		bookID = sc.nextLine();
		myPrint("Name:");
		bookName = sc.nextLine();
		myPrint("Price:");
		bookPrice = sc.nextDouble();
		myPrint("Tac Gia:");
		tacGia = sc.nextLine();
		storeObj.edit(bookID, bookName, tacGia, bookPrice);

	}

	public static void deleteBook() {
		// TODO Auto-generated method stub

	}

	public static void addBook() {
		if (storeObj.checkFull() == false) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String bookName = "";
			String bookID = "";
			String tacGia = "";
			double bookPrice = 0;
			myPrint("ID: ");
			bookID = sc.nextLine();
			myPrint("Name: ");
			bookName = sc.nextLine();
			myPrint("Tac Gia: ");
			tacGia = sc.nextLine();
			myPrint("Price: ");
			bookPrice = sc.nextDouble();

			Book bookObj = new Book(bookID, bookName, tacGia, bookPrice);
			Store storeObj = new Store();
			bookObj.showInfo();
			storeObj.add(bookObj);
		} else {
			System.out.println("Store is full");
		}
	}

	public static void showMenu() {
		myPrint("================BOOK MANAGE================");
		myPrint("1.Add book");
		myPrint("2.Edit book");
		myPrint("3.Delete book");
		myPrint("4.Find book");
		myPrint("5.List book");
		myPrint("6.Exit");
		myPrint("Your choice [1-6]: ");

	}

	private static void myPrint(String string) {
		System.out.println(string);
	}

}
