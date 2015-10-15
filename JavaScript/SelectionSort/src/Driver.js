  var fs = require('fs');
  var readline = require('readline');

  var Author = require('./Author');
  var Book = require('./Book');
  var SelectionSort = require('./SelectionSort');

  // Extract book information from text files into array of Book objects
  extractBooks("../googleBooks100.txt", function(_books100) {
    // Determine the duration to sort 100 books
    console.time("Duration to sort 100 books: ");
    SelectionSort.byAuthor(_books100);
    //SelectionSort.byNumberPages(_books100);
    //SelectionSort.byTitle(_books100);
    console.timeEnd("Duration to sort 100 books: ");
    printBooks(_books100);

    // Extract book information from text files into array of Book objects
    extractBooks("../googleBooks1000.txt", function(_books1000) {
      // Determine the duration to sort 1000 books
      console.time("Duration to sort 1000 books: ");
      SelectionSort.byAuthor(_books1000);
      //SelectionSort.byNumberPages(_books1000);
      //SelectionSort.byTitle(_books1000);
      console.timeEnd("Duration to sort 1000 books: ");
      //printBooks(_books1000);

      // Extract book information from text files into array of Book objects
      extractBooks("../googleBooks10000.txt", function(_books10000) {
        // Determine the duration to sort 10000 books
        console.time("Duration to sort 10000 books: ");
        SelectionSort.byAuthor(_books10000);
        //SelectionSort.byNumberPages(_books10000);
        //SelectionSort.byTitle(_books10000);
        console.timeEnd("Duration to sort 10000 books: ");
        //printBooks(_books10000);
      });
    });
  });

  function extractBooks(fileName, callback) {
    var books = new Array();

    var fileName = fileName;
    readline.createInterface({
      input: fs.createReadStream(fileName),
      terminal: false
    })
    .on('line', function(line) {

      var bookComponents = line.split("*");

      var title = bookComponents[0];

      var authorComponents = bookComponents[1].split(" ");
      var lastName = authorComponents[authorComponents.length-1];
      var firstName = "";
      for(var i = 0; i < authorComponents.length-1; i++) {
        firstName += authorComponents[i] + " ";
      }

      var numberPages = bookComponents[2];

      var author = new Author(firstName, lastName);
      var book = new Book(title, author, numberPages);
      books.push(book);
    })
    .on('close', function() {
      callback(books);
    });
  }

  function printBooks(_books) {
    for(var i = 0; i < _books.length; i++) {
      console.log();
      console.log("Book Number: " + i);
      console.log("Author: " + _books[i].getAuthor().getLastName());
      console.log("Title: " + _books[i].getTitle());
      console.log("Pages: " + _books[i].getNumberPages());
      console.log();
    }
  }
