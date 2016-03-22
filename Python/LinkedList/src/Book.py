
from Author import Author

class Book:
    def __init__(self, title = "", author = Author("",""), numberPages = 0):
        self.__title = title
        self.__author = author
        self.__numberPages = numberPages

    def getAuthor(self):
        return self.__author

    def getNumberPages(self):
        return self.__numberPages

    def getTitle(self):
        return self.__title

    def toString(self):
        return "Author: " + self.__author.getLastName() + "\n" + "Title: " + self.__title + "\n" + "Pages: " + str(self.__numberPages) + "\n\n"
