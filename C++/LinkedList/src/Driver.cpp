#include <iostream>

#include "Book.h"
#include "LinkedList.h"

int main() {

	// Initialize Linked List
	LinkedList<Book> books = LinkedList<Book>();

	// Define Data
	Author author0 = Author("Dan", "Brown");
	Book theDavinciCode = Book("The DaVinci Code", author0, 597);
	Book angelsAndDemons = Book("Angels and Demons", author0, 496);
	Book deceptionPoint = Book("Deception Point", author0, 752);
	Book digitalFortress = Book("Digital Fortress", author0, 544);

	Author author1 = Author("Andy", "Weir");
	Book theMartian = Book("The Martian", author1, 369);

	// Add books to list
	books.add(deceptionPoint);
	books.add(theDavinciCode);
	books.add(theMartian);

	// Verify each book was added to end of list
	std::cout << "Initial Set of Books" << "\n";
	std::cout << "--------------------------------------------------" << "\n";
	std::cout << books.toString();

	// Push book to front of list
	books.push(digitalFortress);

	// Verify book was pushed to front of list
	std::cout << "Pushed Book" << "\n";
	std::cout << "--------------------------------------------------" << "\n";
	std::cout << books.get(0).toString();

	// Add book at index
	books.add(3, angelsAndDemons);

	// Verify book was added to correct index
	std::cout << "Set of Books" << "\n";
	std::cout << "--------------------------------------------------" << "\n";
	std::cout << books.toString();

	// Remove first book from list (Digital Fortress)
	books.remove(0);

	// Verify book was removed
	std::cout << "First Book" << "\n";
	std::cout << "--------------------------------------------------" << "\n";
	std::cout << books.get(0).toString();

	// Delete 3rd book (Angels and Demons)
	books.remove(2);

	// Verify book was removed
	std::cout << "Set of Books" << "\n";
	std::cout << "--------------------------------------------------" << "\n";
	std::cout << books.toString();

	// Delete last book (The Martian)
	books.remove(2);

	// Verify book was removed
	std::cout << "Set of Books" << "\n";
	std::cout << "--------------------------------------------------" << "\n";
	std::cout << books.toString();

	return 0;
}



