#include "Book.h"

Book::Book(string _title, Author _author, int _numberPages) : author(_author) {
	title = _title;
	numberPages = _numberPages;
}

int Book::compareAuthor(Book _book) {
	return this->author.compareTo(_book.getAuthor());
}

int Book::compareNumberPages(Book _book) {
	int compare = 0;

	if(this->numberPages < _book.getNumberPages()) {
		compare = -1;
	} else if(this->numberPages > _book.getNumberPages()) {
		compare = 1;
	}

	return compare;
}

int Book::compareTitle(Book _book) {
	int compare = 0;

	if(this->title < _book.getTitle()) {
		compare = -1;
	} else if(this->title > _book.getTitle()) {
		compare = 1;
	}

	return compare;
}
