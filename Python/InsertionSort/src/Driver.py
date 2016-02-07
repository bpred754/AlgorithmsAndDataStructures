
from Book import Book
from Author import Author
from InsertionSort import InsertionSort
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

# Extract book information from text files into array of Book objects
books100 = extractBooks("../googleBooks100.txt")
books1000 = extractBooks("../googleBooks1000.txt")
books10000 = extractBooks("../googleBooks10000.txt")

# Determine the duration to sort 100 books
startTime100 = timer()
InsertionSort.byAuthor(books100)
#InsertionSort.byNumberPages(books100)
#InsertionSort.byTitle(books100)
endTime100 = timer()
duration100 = (endTime100 - startTime100) * 1000 # Convert to milliseconds
print "Duration to sort 100 books: " + str(duration100)
printBooks(books100)

# Determine the duration to sort 1000 books
startTime1000 = timer()
InsertionSort.byAuthor(books1000)
#InsertionSort.byNumberPages(books1000)
#InsertionSort.byTitle(books1000)
endTime1000 = timer()
duration1000 = (endTime1000 - startTime1000) * 1000 # Convert to milliseconds
print "Duration to sort 1000 books: " + str(duration1000)
#printBooks(books1000)

# Determine the duration to sort 10000 books
startTime10000 = timer()
InsertionSort.byAuthor(books10000)
#InsertionSort.byNumberPages(books10000)
#InsertionSort.byTitle(books10000)
endTime10000 = timer()
duration10000 = (endTime10000 - startTime10000) * 1000 # Convert to milliseconds
print "Duration to sort 10000 books: " + str(duration10000)
#printBooks(books10000)
