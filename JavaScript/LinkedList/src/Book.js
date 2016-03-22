
  function Book(_title, _author, _numberPages) {

    var self = this;
    self.title = _title;
    self.author = _author;
    self.numberPages = _numberPages;

    function getAuthor() {
      return self.author;
    }

    function getNumberPages() {
      return self.numberPages;
    }

    function getTitle() {
      return self.title;
    }

    function toString() {
      return "Author: " + self.author.getLastName() + "\n" + "Title: " + self.title + "\n" + "Pages: " + self.numberPages + "\n\n";
    }

    return {
      getAuthor: getAuthor,
      getNumberPages: getNumberPages,
      getTitle: getTitle,
      toString: toString
    }
  }

  module.exports = Book;
