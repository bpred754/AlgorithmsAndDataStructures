package domain;

public class Author{
	
	private String firstName;
	private String lastName;
	
	public Author(String _firstName, String _lastName) {
		this.firstName = _firstName;
		this.lastName = _lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
}
