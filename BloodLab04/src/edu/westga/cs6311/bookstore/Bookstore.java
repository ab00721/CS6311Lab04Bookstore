package edu.westga.cs6311.bookstore;

import edu.westga.cs6311.book.Book; 

/**
 * Bookstore with name, tax rate, sales, and books
 * @author Anna Blood
 * @version 09/13/2022
 *
 */
public class Bookstore {
	
	private static final double TAX_RATE = 0.07;
	private String storeName;
	private double storeSales;
	private Book bookOne;
	private Book bookTwo;
	private Book bookThree;
	
	/**
	 * Constructor
	 * @param sName set bookstore name
	 */
	public Bookstore(String sName) {
		this.storeName = sName;
		this.bookOne = new Book("The Alchemist", "Paulo Coelho", 197, 22.78); 
		this.bookTwo = new Book("The Lost Art of Reading Nature's Signs", "Tristan Gooley", 352, 17.95);
		this.bookThree = new Book("Breath", "James Nestor", 279, 16.22);
	}
	
	/**
	 * Method to get title and price for each book 
	 * @return book title and price 
	 */
	public String getBookNamesForSaleAndPrice() {
		return ("\nBook 1: " + this.bookOne.getTitle() + ", Price: " + String.format("%.2f", this.bookOne.getPrice()) 
				+ "\nBook 2: " + this.bookTwo.getTitle() + ", Price: " + String.format("%.2f", this.bookTwo.getPrice()) 
				+ "\nBook 3: " + this.bookThree.getTitle() + ", Price: " + String.format("%.2f", this.bookThree.getPrice()));
	}

	/**
	 * Method to calculate value of all the books in bookstore
	 * @return value of bookstore
	 */
	public String calculateTotalValueOfBookstore() {
		return ("$" + String.format("%.2f", Math.floor((this.bookOne.getPrice() + this.bookTwo.getPrice() + this.bookThree.getPrice()))));
	}
	
	/**
	 * Method to calculate price of book plus tax as double 
	 * @return price of book with tax as double
	 */
	private double calculateBookSaleWithTaxAsDouble() {
		return (this.bookOne.getPrice() + (this.bookOne.getPrice() * TAX_RATE));
	}
	
	/**
	 * Method to convert price with tax from double to string
	 * @return price of book with tax as string
	 */
	public String calculateSaleBookWithTax() {
		return ("$" + String.format("%.2f", this.calculateBookSaleWithTaxAsDouble()));
	}
	
	/**
	 * Method to calculate total sales
	 * @return total sales 
	 */
	public String calculateTotalStoreSales() {
		return ("$" + String.format("%.2f", this.getStoreSales()));
	}
	
	/**
	 * Method to add sale to total store sales
	 */
	public void sellBook() {
		this.storeSales = (this.bookOne.getPrice()) + this.calculateBookSaleWithTaxAsDouble();
	}
	
	/**
	 * Method to add a new Book for sale
	 */
	public void addNewBookForSale() {
		this.bookOne = this.bookTwo;
	}
	
	/**
	 * Getter
	 * @return the store name
	 */
	public String getStoreName() {
		return this.storeName; 
	}
	/**
	 * Getter
	 * @return the store sales
	 */
	
	public double getStoreSales() {
		return this.storeSales; 
	}
	
	/**
	 * Getter
	 * @return the book one
	 */
	public Book getBookOne() {
		return this.bookOne; 
	}
	
	/**
	 * Getter
	 * @return the book Two 
	 */
	public Book getBookTwo() {
		return this.bookTwo; 
	}
	
	/**
	 * Getter
	 * @return the book three
	 */
	public Book getBookThree() {
		return this.bookThree; 
	}
	
	/**
	 * Setter
	 * @param storeName set storeName
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	/**
	 * Setter
	 * @param storeSales set storeSales
	 */
	public void setStoreSales(double storeSales) {
		this.storeSales = storeSales; 
	}
	
	/**
	 * Setter
	 * @param bookOne set bookOne
	 */
	public void setBookOne(Book bookOne) {
		this.bookOne = bookOne; 
	}
	
	/**
	 * Setter
	 * @param bookTwo set bookTwo
	 */
	public void setBookTwo(Book bookTwo) {
		this.bookTwo = bookTwo; 
	}
	
	/**
	 * Setter
	 * @param bookThree set bookThree
	 */
	public void setBookThree(Book bookThree) {
		this.bookThree = bookThree; 
	}
}
