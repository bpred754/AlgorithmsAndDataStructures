#ifndef BOOK_H
#define BOOK_H

#include "Author.h"

class Book {

	private:
		string title;
		Author author;
		int numberPages;
	public:
		Book(string, Author, int);
	    int compareAuthor(Book);
	    int compareNumberPages(Book);
	    int compareTitle(Book);

	    Author getAuthor() const {
	    	return author;
	    }

		int getNumberPages() const {
			return numberPages;
		}

		string getTitle() const{
			return title;
		}
};

#endif //BOOK_H
