
from Author import Author

class Book:
    def __init__(self, title = "", author = Author("",""), numberPages = 0):
        self.__title = title
        self.__author = author
        self.__numberPages = numberPages

    def compareAuthor(self, book):
        return self.__author.compareTo(book.getAuthor())

    def compareNumberPages(self, book):
        compare = 0
        if int(self.__numberPages) < int(book.getNumberPages()):
            compare = -1
        elif int(self.__numberPages) > int(book.getNumberPages()):
            compare = 1
        return compare

    def compareTitle(self, book):
        compare = 0
        if self.__title < book.getTitle():
            compare = -1
        elif self.__title > book.getTitle():
            compare = 1
        return compare

    def getAuthor(self):
        return self.__author

    def getNumberPages(self):
        return self.__numberPages

    def getTitle(self):
        return self.__title
