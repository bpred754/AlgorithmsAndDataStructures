package domain;

public class InsertionSort {
	
	public static void byAuthor(Book[] _books) {
		for(int i = 1; i < _books.length; i++) {
			int j = i - 1;
			Book insert = _books[i];
			while(j >= 0 && _books[j].compareAuthor(insert) > 0) {
				_books[j+1] = _books[j];
				j--;
			}
			_books[j+1] = insert;
		}
	}
	
	public static void byNumberPages(Book[] _books) {
		for(int i = 1; i < _books.length; i++) {
			int j = i - 1;
			Book insert = _books[i];
			while(j >= 0 && _books[j].compareNumberPages(insert) > 0) {
				_books[j+1] = _books[j];
				j--;
			}
			_books[j+1] = insert;
		}
	}
	
	public static void byTitle(Book[] _books) {
		for(int i = 1; i < _books.length; i++) {
			int j = i - 1;
			Book insert = _books[i];
			while(j >= 0 && _books[j].compareTitle(insert) > 0) {
				_books[j+1] = _books[j];
				j--;
			}
			_books[j+1] = insert;
		}
	}
}
