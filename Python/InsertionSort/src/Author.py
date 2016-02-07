
class Author:
    def __init__(self, firstName, lastName):
        self.__firstName = firstName
        self.__lastName = lastName

    def compareTo(self, author):
        compare = 0
        if self.__lastName > author.getLastName():
            compare = 1
        elif self.__lastName < author.getLastName():
            compare = -1
        return compare

    def getFirstName(self):
        return self.__firstName

    def getLastName(self):
        return self.__lastName
