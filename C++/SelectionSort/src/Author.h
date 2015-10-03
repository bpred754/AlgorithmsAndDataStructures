#ifndef AUTHOR_H
#define AUTHOR_H

#include <string>
using std::string;

class Author {
	private:
		string lastName;
		string firstName;

	public:
		Author(string, string);
		int compareTo(Author);

		string getFirstName() const {
			return firstName;
		}

		string getLastName() const {
			return lastName;
		}
};

#endif // AUTHOR_H
