package edu.westga.cs6311.book;

/**
 * Describes books with title, author, pages, and price 
 * @author Anna Blood
 * @version 09/13/2022
 * 
 */
public class Book {
	
	private String title;
	private String author;
	private int numPages;
	private double price; 
	
	/**
	 * Constructor 
	 * @param bTitle sets book title
	 * @param bAuthor sets book author
	 * @param bNumPages sets books numPages
	 * @param bPrice sets books price 
	 */
	public Book(String bTitle, String bAuthor, int bNumPages, double bPrice) {
		this.title = bTitle;
		this.author = bAuthor;
		this.numPages = bNumPages;
		this.price = bPrice;
	}
	
	/**
	 * Method to get title, author, pages, and price
	 * @return title, author, pages, and price for book 
	 */
	public String getBookDescription() {
		return ("Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.numPages + ", Price: " + String.format("%.2f", this.price)); 
	}
	
	/**
	 * Getter
	 * @return the title
	 */
	public String getTitle() {
		return this.title; 
	}
	
	/**
	 * Getter
	 * @return the author
	 */
	public String getAuthor() {
		return this.author; 
	}
	
	/**
	 * Getter
	 * @return the number of pages
	 */
	public int getNumPages() {
		return this.numPages; 
	}
	
	/**
	 * Getter
	 * @return the title
	 */
	public double getPrice() {
		return this.price; 
	}
	
	/**
	 * Setter
	 * @param title set title 
	 */
	public void setTitle(String title) {
		this.title = title; 
	}
	
	/**
	 * Setter
	 * @param author set author
	 */
	public void setAuthor(String author) {
		this.author = author; 
	}
	
	/**
	 * Setter
	 * @param numPages set numPages
	 */
	public void setNumPages(int numPages) {
		this.numPages = numPages; 
	}
	
	/**
	 * Setter
	 * @param price set price
	 */
	public void setPrice(double price) {
		this.price = price; 
	}
}
