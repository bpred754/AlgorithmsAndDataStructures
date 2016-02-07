#include "InsertionSort.h"

void InsertionSort::byAuthor(vector<Book>& _books) {
	for(int i = 1; i < _books.size(); i++) {
		int j = i - 1;
		Book insert = _books[i];
		while(j >= 0 && _books[j].compareAuthor(insert) > 0) {
			_books[j+1] = _books[j];
			j--;
		}
		_books[j+1] = insert;
	}
}

void InsertionSort::byNumberPages(vector<Book>& _books) {
	for(int i = 1; i < _books.size(); i++) {
		int j = i - 1;
		Book insert = _books[i];
		while(j >= 0 && _books[j].compareNumberPages(insert) > 0) {
			_books[j+1] = _books[j];
			j--;
		}
		_books[j+1] = insert;
	}
}

void InsertionSort::byTitle(vector<Book>& _books) {
	for(int i = 1; i < _books.size(); i++) {
		int j = i - 1;
		Book insert = _books[i];
		while(j >= 0 && _books[j].compareTitle(insert) > 0) {
			_books[j+1] = _books[j];
			j--;
		}
		_books[j+1] = insert;
	}
}



