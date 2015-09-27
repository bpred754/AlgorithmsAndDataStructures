package domain;

public class Book {
	
	private Author author;
	private int numberPages;
	private String title;
	
	public Book(String _title, Author _author, int _numberPages) {
		this.author = _author;
		this.numberPages = _numberPages;
		this.title = _title;
	}
	
	public int compareAuthor(Book _book) {
		return this.author.compareTo(_book.getAuthor());
	}
	
	public int compareNumberPages(Book _book) {
		int _numberPages = _book.getNumberPages();
		if(this.numberPages < _numberPages) {
			return -1;
		} else if(this.numberPages == _numberPages) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public int compareTitle(Book _book) {
		return this.title.compareTo(_book.getTitle());
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public int getNumberPages() {
		return this.numberPages;
	}
	
	public String getTitle() {
		return this.title;
	}
}
