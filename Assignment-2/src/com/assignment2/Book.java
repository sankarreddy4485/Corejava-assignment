package com.assignment2;

public class Book {

	private String bookName;
	 private Author author;
	 private int pages;
	 private double cost;
	 private int bookNumber;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public Book(String bookName, Author author, int pages, double cost, int bookNumber) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.pages = pages;
		this.cost = cost;
		this.bookNumber = bookNumber;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", pages=" + pages + ", cost=" + cost
				+ ", bookNumber=" + bookNumber + "]";
	}
	 
	
	 
	 
}
