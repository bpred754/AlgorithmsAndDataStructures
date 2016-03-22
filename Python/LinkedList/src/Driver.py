
from Book import Book
from Author import Author
from LinkedList import LinkedList

# Initialize Linked List
books = LinkedList()

# Define Data
author0 = Author("Dan", "Brown")
theDavinciCode = Book("The DaVinci Code", author0, 597)
angelsAndDemons = Book("Angels and Demons", author0, 496)
deceptionPoint = Book("Deception Point", author0, 752)
digitalFortress = Book("Digital Fortress", author0, 544)

author1 = Author("Andy", "Weir")
theMartian = Book("The Martian", author1, 369)

# Add books to list
books.add(deceptionPoint)
books.add(theDavinciCode)
books.add(theMartian)

# Verify each book was added to end of list
print "Initial Set of Books"
print "--------------------------------------------------"
print books.toString()

# Push book to front of list
books.push(digitalFortress)

# Verify book was pushed to front of list
print "Pushed Book"
print "--------------------------------------------------"
print books.get(0).toString()

# Add book at index
books.addAtIndex(3, angelsAndDemons);

# Verify book was added to correct index
print "Set of Books"
print "--------------------------------------------------"
print books.toString()

# Remove first book from list (Digital Fortress)
books.remove(0)

# Verify book was removed
print "First Book"
print "--------------------------------------------------"
print books.get(0).toString()

# Delete 3rd book (Angels and Demons)
books.remove(2)

# Verify book was removed
print "Set of Books"
print "--------------------------------------------------"
print books.toString()

# Delete last book (The Martian)
books.remove(2)

# Verify book was removed
print "Set of Books"
print "--------------------------------------------------"
print books.toString()
