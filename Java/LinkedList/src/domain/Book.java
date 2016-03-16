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
	
	public Author getAuthor() {
		return this.author;
	}
	
	public int getNumberPages() {
		return this.numberPages;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public String toString() {
		return "Author: " + this.author.getLastName() + "\n" + "Title: " + this.title + "\n" + "Pages: " + this.numberPages + "\n\n";
	}
}
