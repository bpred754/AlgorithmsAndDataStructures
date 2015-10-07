
from Book import Book
from Author import Author
from SelectionSort import SelectionSort
from timeit import default_timer as timer

def extractBooks(inFileName):

    txt = open(inFileName)
    splitTxt = txt.read().split("\n")
    splitTxt = splitTxt[:-1] # Remove blank string from the last index of the array

    books = [Book()]
    for line in splitTxt:
        bookComponents = line.split("*")
        title = bookComponents[0]
        authorComponents = bookComponents[1].split(" ")
        lastName = authorComponents[len(authorComponents)-1]
        firstName = ""
        index = 0
        for name in authorComponents:
            if index < len(authorComponents) - 1:
                firstName += name + " "
            index += 1
        author = Author(firstName, lastName)
        numberPages = bookComponents[2]
        book = Book(title, author, numberPages)
        books.append(book)
    return books[1:];

def printBooks(books):
    index = 0
    for book in books:
        print ""
        print "Book Number: " + str(index)
        print "Author: " + book.getAuthor().getLastName()
        print "Title: " + book.getTitle()
        print "Pages: " + book.getNumberPages()
        index += 1

books100 = extractBooks("../googleBooks100.txt")
books1000 = extractBooks("../googleBooks1000.txt")
books10000 = extractBooks("../googleBooks10000.txt")

startTime100 = timer()
SelectionSort.byAuthor(books100)
#SelectionSort.byNumberPages(books100)
#SelectionSort.byTitle(books100)
endTime100 = timer()
duration100 = (endTime100 - startTime100) * 1000 # Convert to milliseconds
print "Duration to sort 100 books: " + str(duration100)
printBooks(books100)

startTime1000 = timer()
SelectionSort.byAuthor(books1000)
#SelectionSort.byNumberPages(books1000)
#SelectionSort.byTitle(books1000)
endTime1000 = timer()
duration1000 = (endTime1000 - startTime1000) * 1000 # Convert to milliseconds
print "Duration to sort 1000 books: " + str(duration1000)
#printBooks(books1000)

startTime10000 = timer()
SelectionSort.byAuthor(books10000)
#SelectionSort.byNumberPages(books10000)
#SelectionSort.byTitle(books10000)
endTime10000 = timer()
duration10000 = (endTime10000 - startTime10000) * 1000 # Convert to milliseconds
print "Duration to sort 10000 books: " + str(duration10000)
#printBooks(books10000)
