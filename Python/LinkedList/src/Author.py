
class Author:
    def __init__(self, firstName, lastName):
        self.__firstName = firstName
        self.__lastName = lastName

    def getFirstName(self):
        return self.__firstName

    def getLastName(self):
        return self.__lastName
