#include "SelectionSort.h"

void SelectionSort::byAuthor(vector<Book>& _books) {

	for(int i = 0; i < _books.size(); i++) {
		int minIndex = i;
		for(int j = i+1; j < _books.size(); j++) {

			if(_books[j].compareAuthor(_books[minIndex]) < 0) {
				minIndex = j;
			}
		}
		if(minIndex != i) {
			swapBooks(_books, i, minIndex);
		}
	}
}

void SelectionSort::byNumberPages(vector<Book>& _books) {

	for(int i = 0; i < _books.size(); i++) {
		int minIndex = i;
		for(int j = i+1; j < _books.size(); j++) {

			if(_books[j].compareNumberPages(_books[minIndex]) < 0) {
				minIndex = j;
			}
		}
		if(minIndex != i) {
			swapBooks(_books, i, minIndex);
		}
	}
}

void SelectionSort::byTitle(vector<Book>& _books) {

	for(int i = 0; i < _books.size(); i++) {
		int minIndex = i;
		for(int j = i+1; j < _books.size(); j++) {

			if(_books[j].compareTitle(_books[minIndex]) < 0) {
				minIndex = j;
			}
		}
		if(minIndex != i) {
			swapBooks(_books, i, minIndex);
		}
	}
}

void SelectionSort::swapBooks(vector<Book>& _books, int _swap1, int _swap2) {
	Book temp = _books[_swap1];
	_books[_swap1] = _books[_swap2];
	_books[_swap2] = temp;
}
