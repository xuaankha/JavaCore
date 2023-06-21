package com.kha.bookstore;

public class Store {
	private static int totalItems = 0;
	private final int MAX_ITEMS = 10;
	private Book[] listItems = null;

	public Store() {
		listItems = new Book[MAX_ITEMS];
	}

	public int getItemPosition(String bookID) {
		for (int i = 0; i < totalItems; i++) {
			if (bookID.equals(listItems[i].getBookID()) == true)
				return i;
		}
		return -1;
	}

	public boolean checkFull() {
		if (totalItems == MAX_ITEMS) {
			return true;
		}
		return false;
	}

	public boolean checkEmpty() {
		if (totalItems == 0) {
			return true;
		}
		return false;
	}

	public void add(Book bookObj) {
		if (this.checkFull() == false) {
			this.listItems[totalItems] = bookObj;
			Store.totalItems++;
			System.out.println("Add successful");
		} else {
			System.out.println("Store is full");
		}
	}

	public void edit(String bookID, String bookName, String tacGia, double bookPrice) {
		int bookPosition = this.getItemPosition(bookID);
		if (bookPosition == -1) {
			System.out.println("This book is not exist!");
		} else {
			listItems[bookPosition].setBookName(bookName);
			listItems[bookPosition].setBookPrice(bookPrice);
			listItems[bookPosition].setTacGia(tacGia);
			System.out.println("Edit successful");

		}
	}

	public void delete(String bookID) {

	}

	public void find(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if (bookPosition == -1) {
			System.out.println("This book is not exist!");
		} else {
			listItems[bookPosition].showInfo();
		}
	}

	public void list() {
		if (this.checkEmpty() == false) {
			for (int i = 0; i < totalItems; i++) {
				this.listItems[i].showInfo();
			}
		} else {
			System.out.println("Store is empty");
		}

	}

}
