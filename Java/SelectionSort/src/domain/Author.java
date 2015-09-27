package domain;

public class Author implements Comparable<Author>{
	
	private String firstName;
	private String lastName;
	
	public Author(String _firstName, String _lastName) {
		this.firstName = _firstName;
		this.lastName = _lastName;
	}
	
	@Override
	public int compareTo(Author _author) {
		return this.lastName.compareTo(_author.getLastName());
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
}
