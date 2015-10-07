
  function Book(_title, _author, _numberPages) {

    var self = this;
    self.title = _title;
    self.author = _author;
    self.numberPages = _numberPages;

    function compareAuthor(_book) {
      return self.author.compareTo(_book.getAuthor());
    }

    function compareNumberPages(_book) {
      var compare = 0;
      if(parseInt(self.numberPages) < parseInt(_book.getNumberPages())) {
        compare = -1;
      } else if(parseInt(self.numberPages) > parseInt(_book.getNumberPages())){
        compare = 1;
      }
      return compare;
    }

    function compareTitle(_book) {
      return self.title.localeCompare(_book.getTitle());
    }

    function getAuthor() {
      return self.author;
    }

    function getNumberPages() {
      return self.numberPages;
    }

    function getTitle() {
      return self.title;
    }

    return {
      compareAuthor: compareAuthor,
      compareNumberPages: compareNumberPages,
      compareTitle: compareTitle,
      getAuthor: getAuthor,
      getNumberPages: getNumberPages,
      getTitle: getTitle
    }
  }

  module.exports = Book;
