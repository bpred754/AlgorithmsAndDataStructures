package main;

import domain.Author;
import domain.Book;
import domain.LinkedList;

public class Driver {
	
	public static void main(String[] args) {
	
		// Initialize Linked List
		LinkedList<Book> books = new LinkedList<Book>();
		
		// Define Data
		Author author0 = new Author("Dan", "Brown");
		Book theDavinciCode = new Book("The DaVinci Code", author0, 597);
		Book angelsAndDemons = new Book("Angels and Demons", author0, 496);
		Book deceptionPoint = new Book("Deception Point", author0, 752);
		Book digitalFortress = new Book("Digital Fortress", author0, 544);
		
		Author author1 = new Author("Andy", "Weir");
		Book theMartian = new Book("The Martian", author1, 369);
		
		// Add books to list
		books.add(deceptionPoint);
		books.add(theDavinciCode);
		books.add(theMartian);
		
		// Verify each book was added to end of list
		System.out.println("Initial Set of Books");
		System.out.println("--------------------------------------------------");
		System.out.println(books.toString());
		
		// Push book to front of list
		books.push(digitalFortress);
		
		// Verify book was pushed to front of list
		System.out.println("Pushed Book");
		System.out.println("--------------------------------------------------");
		System.out.println(books.get(0));
		
		// Add book at index
		books.add(3, angelsAndDemons);
		
		// Verify book was added to correct index
		System.out.println("Set of Books");
		System.out.println("--------------------------------------------------");
		System.out.println(books.toString());
		
		// Remove first book from list (Digital Fortress)
		books.remove(0);
		
		// Verify book was removed
		System.out.println("First Book");
		System.out.println("--------------------------------------------------");
		System.out.println(books.get(0));
		
		// Delete 3rd book (Angels and Demons)
		books.remove(2);
		
		// Verify book was removed
		System.out.println("Set of Books");
		System.out.println("--------------------------------------------------");
		System.out.println(books.toString());
		
		// Delete last book (The Martian)
		books.remove(2);
		
		// Verify book was removed
		System.out.println("Set of Books");
		System.out.println("--------------------------------------------------");
		System.out.println(books.toString());
	}
}
