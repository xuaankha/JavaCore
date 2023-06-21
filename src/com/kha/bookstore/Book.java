package com.kha.bookstore;

public class Book {
	private String bookID, bookName, tacGia;
	private double bookPrice;

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Book(String bookID, String bookName, String tacGia, double bookPrice) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.tacGia = tacGia;
		this.bookPrice = bookPrice;
	}

	public void showInfo() {
		System.out.println("=====Book info=====");
		System.out.println("ID:" + this.getBookID());
		System.out.println("Name:" + this.getBookName());
		System.out.println("Tac Gia:" + this.getTacGia());
		System.out.println("Price:" + this.getBookPrice());
	}

}
