package domain;

public class Sort {
	
	public static int[] selectionSort(int[] input) {
		
		for(int i = 0; i < input.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < input.length; j++) {
				if(input[j] < input[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = input[i];
				input[i] = input[minIndex];
				input[minIndex] = temp;
			}
		}
		return input;
	}
	
	public static Book[] selectionSortByAuthor(Book[] _books) {
		Book[] sortedBooks = _books;
		for(int i = 0; i < sortedBooks.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < sortedBooks.length; j++) {
				
				if(sortedBooks[j] == null) {
					System.out.println("FOUND NULL");
					System.out.println("i: " + i);
					System.out.println("J: " + j);
				}
				
				if(sortedBooks[minIndex] == null) {
					System.out.println("FOUND NULL");
					System.out.println("minIndex: " + minIndex);
				}
				
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
	
	public static Book[] selectionSortByNumberPages(Book[] _books) {
		Book[] sortedBooks = _books;
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
	
	public static Book[] selectionSortByTitle(Book[] _books) {
		Book[] sortedBooks = _books;
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
