package domain;

public class SelectionSort {
	
	public static Book[] byAuthor(Book[] _books) {
		Book[] sortedBooks = _books.clone();
		for(int i = 0; i < sortedBooks.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < sortedBooks.length; j++) {
				
				if(sortedBooks[j].compareAuthor(sortedBooks[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swapBooks(sortedBooks, i, minIndex);
			}
		}
		return sortedBooks;
	}
	
	public static Book[] byNumberPages(Book[] _books) {
		Book[] sortedBooks = _books.clone();
		for(int i = 0; i < sortedBooks.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < sortedBooks.length; j++) {
				if(sortedBooks[j].compareNumberPages(sortedBooks[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swapBooks(sortedBooks, i, minIndex);
			}
		}
		return sortedBooks;
	}
	
	public static Book[] byTitle(Book[] _books) {
		Book[] sortedBooks = _books.clone();
		for(int i = 0; i < sortedBooks.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < sortedBooks.length; j++) {
				if(sortedBooks[j].compareTitle(sortedBooks[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swapBooks(sortedBooks, i, minIndex);
			}
		}
		return sortedBooks;
	}
	
	private static void swapBooks(Book[] _books, int swap1, int swap2) {
		Book temp = _books[swap1];
		_books[swap1] = _books[swap2];
		_books[swap2] = temp;
	}
}
