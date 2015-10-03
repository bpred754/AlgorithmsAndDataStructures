#include "Author.h"

Author::Author(string _firstName, string _lastName) {
	firstName = _firstName;
	lastName = _lastName;
}

int Author::compareTo(Author _author) {

	int compare = 0;
	if(this->lastName > _author.getLastName()) {
		compare = 1;
	} else if(this->lastName < _author.getLastName()) {
		compare = -1;
	}

	return compare;
}
