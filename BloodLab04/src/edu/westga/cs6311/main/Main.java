package edu.westga.cs6311.main;

import edu.westga.cs6311.book.Book; 
import edu.westga.cs6311.bookstore.Bookstore; 

/**
 * Main class to test book and bookstore class
 * @author Anna Blood
 * @version 09/13/22
 *
 */
public class Main {
	
	/**
	 * Application entry point
	 * @param args Not used 
	 */
	public static void main(String[] args) {
		System.out.println("Part 1");		
		Book book1 = new Book("The Very Hungry Caterpillar", "Eric Carle", 26, 8.94298);
		System.out.print(book1.getBookDescription());
		Bookstore myBookstore = new Bookstore("Bookstore");
		System.out.print(myBookstore.getBookNamesForSaleAndPrice());
		
		System.out.print("\n\nPart 2");
		System.out.print("\nBookstoreValue: " + myBookstore.calculateTotalValueOfBookstore());
		System.out.print(myBookstore.getBookNamesForSaleAndPrice());
		myBookstore.sellBook();
		myBookstore.addNewBookForSale();
		myBookstore.sellBook();
		myBookstore.addNewBookForSale();
		myBookstore.sellBook();
		myBookstore.addNewBookForSale();
		System.out.print("\nTotal Store Sales: " + myBookstore.calculateTotalStoreSales());
	}
}
