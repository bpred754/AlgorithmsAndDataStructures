#include <iostream>
#include <fstream>
#include <cstdlib>

#include "Book.h"
#include "SelectionSort.h"
#include "Utility.h"

using std::cout;

void extractBooks(string _fileName, vector<Book>& _books) {

	string line;
	std::ifstream bookFile(_fileName);

	if(bookFile.is_open()) {
		int count = 0;
		while(getline(bookFile, line)) {

			vector<string> bookComponents = Utility::split(line,'*');

			string title = bookComponents[0];

			vector<string> authorNames = Utility::split(bookComponents[1], ' ');
			string lastName = authorNames[authorNames.size()-1];
			string firstName;
			for(int i = 0; i < authorNames.size()-1;i++) {
				firstName += authorNames[i] + " ";
			}

			int numberPages = atoi(bookComponents[2].c_str());

			Author author = Author(firstName, lastName);
			Book book = Book(title, author, numberPages);
			_books.push_back(book);

			count++;
		}
		bookFile.close();
	} else {
		cout << "Failed to open: " << _fileName;
	}
}

void printBooks(vector<Book> _books) {
	for(int i = 0; i < _books.size(); i++) {
		cout << '\n';
		cout << "Book Number: " << i << '\n';
		cout << "Author: " << _books[i].getAuthor().getLastName() << '\n';
		cout << "Title: " << _books[i].getTitle() << '\n';
		cout << "Pages: " << _books[i].getNumberPages() << '\n';
		cout << '\n';
	}
}

int main() {

	// Vectors to hold Book objects
	vector<Book> books100;
	vector<Book> books1000;
	vector<Book> books10000;

	// Extract book information from text files into vector of Book objects
	extractBooks("googleBooks100.txt", books100);
	extractBooks("googleBooks1000.txt", books1000);
	extractBooks("googleBooks10000.txt", books10000);

	// Determine the duration to sort 100 books
	int64 startTime100 = Utility::getTimeMs();
	SelectionSort::byAuthor(books100);
	//SelectionSort::byNumberPages(books100);
	//SelectionSort::byTitle(books100);
	int64 endTime100 = Utility::getTimeMs();
	int64 duration100 = endTime100 - startTime100;
	cout << "Duration to sort 100 books: " << duration100 << '\n';
	printBooks(books100);

	// Determine the duration to sort 1000 books
	int64 startTime1000 = Utility::getTimeMs();
	SelectionSort::byAuthor(books1000);
	//SelectionSort::byNumberPages(books1000);
	//SelectionSort::byTitle(books1000);
	int64 endTime1000 = Utility::getTimeMs();
	int64 duration1000 = endTime1000 - startTime1000;
	cout << "Duration to sort 1000 books: " << duration1000 << '\n';
	//printBooks(books1000);

	// Determine the duration to sort 10000 books
	int64 startTime10000 = Utility::getTimeMs();
	SelectionSort::byAuthor(books10000);
	//SelectionSort::byNumberPages(books10000);
	//SelectionSort::byTitle(books10000);
	int64 endTime10000 = Utility::getTimeMs();
	int64 duration10000 = endTime10000 - startTime10000;
	cout << "Duration to sort 10000 books: " << duration10000 << '\n';
	//printBooks(books10000);

	return 0;
}
