
  var Author = require('./Author');
  var Book = require('./Book');
  var LinkedList = require('./LinkedList');

  // Initialize Linked List
  var books = new LinkedList();

	// Define Data
	var author0 = new Author("Dan", "Brown");
	var theDavinciCode = new Book("The DaVinci Code", author0, 597);
	var angelsAndDemons = new Book("Angels and Demons", author0, 496);
	var deceptionPoint = new Book("Deception Point", author0, 752);
	var digitalFortress = new Book("Digital Fortress", author0, 544);

	var author1 = new Author("Andy", "Weir");
	var theMartian = new Book("The Martian", author1, 369);

	// Add books to list
	books.add(deceptionPoint);
	books.add(theDavinciCode);
	books.add(theMartian);

	// Verify each book was added to end of list
	console.log("Initial Set of Books");
	console.log("--------------------------------------------------");
	console.log(books.toString());

  // Push book to front of list
	books.push(digitalFortress);

	// Verify book was pushed to front of list
	console.log("Pushed Book");
	console.log("--------------------------------------------------");
	console.log(books.get(0).toString());

  // Add book at index
	books.addAtIndex(3, angelsAndDemons);

	// Verify book was added to correct index
	console.log("Set of Books");
	console.log("--------------------------------------------------");
	console.log(books.toString());

  // Remove first book from list (Digital Fortress)
	books.remove(0);

	// Verify book was removed
	console.log("First Book");
	console.log("--------------------------------------------------");
	console.log(books.get(0).toString());

  // Delete 3rd book (Angels and Demons)
	books.remove(2);

	// Verify book was removed
	console.log("Set of Books");
	console.log("--------------------------------------------------");
	console.log(books.toString());

  // Delete last book (The Martian)
	books.remove(2);

	// Verify book was removed
	console.log("Set of Books");
	console.log("--------------------------------------------------");
	console.log(books.toString());
