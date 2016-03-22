#ifndef BOOK_H
#define BOOK_H

#include "Author.h"

class Book {

	private:
		string title;
		Author author;
		int numberPages;
	public:
		Book(string _title, Author _author, int _numberPages) : author(_author) {
			title = _title;
			numberPages = _numberPages;
		}

	    Author getAuthor() const {
	    	return author;
	    }

		int getNumberPages() const {
			return numberPages;
		}

		string getTitle() const {
			return title;
		}

		string toString() {
			return "Author: " + author.getLastName() + "\n" + "Title: " + title + "\n" + "Pages: " + std::to_string(numberPages) + "\n\n";
		}
};

#endif //BOOK_H
