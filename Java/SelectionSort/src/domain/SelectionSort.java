package domain;

public class SelectionSort {
	
	public static void byAuthor(Book[] _books) {
		for(int i = 0; i < _books.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < _books.length; j++) {
				
				if(_books[j].compareAuthor(_books[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swapBooks(_books, i, minIndex);
			}
		}
	}
	
	public static void byNumberPages(Book[] _books) {
		for(int i = 0; i < _books.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < _books.length; j++) {
				if(_books[j].compareNumberPages(_books[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swapBooks(_books, i, minIndex);
			}
		}
	}
	
	public static void byTitle(Book[] _books) {
		for(int i = 0; i < _books.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < _books.length; j++) {
				if(_books[j].compareTitle(_books[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swapBooks(_books, i, minIndex);
			}
		}
	}
	
	private static void swapBooks(Book[] _books, int swap1, int swap2) {
		Book temp = _books[swap1];
		_books[swap1] = _books[swap2];
		_books[swap2] = temp;
	}
}
