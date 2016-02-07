
  function InsertionSort(){};

  InsertionSort.byAuthor = function(_books) {
    for(var i = 1; i < _books.length; i++) {
      var j = i - 1;
      var insert = _books[i];
      while(j >= 0 && _books[j].compareAuthor(insert) > 0) {
        _books[j+1] = _books[j];
        j--;
      }
      _books[j+1] = insert;
    }
  }

  InsertionSort.byNumberPages = function(_books) {
    for(var i = 1; i < _books.length; i++) {
      var j = i - 1;
      var insert = _books[i];
      while(j >= 0 && _books[j].compareNumberPages(insert) > 0) {
        _books[j+1] = _books[j];
        j--;
      }
      _books[j+1] = insert;
    }
  }

  InsertionSort.byTitle = function(_books) {
    for(var i = 1; i < _books.length; i++) {
      var j = i - 1;
      var insert = _books[i];
      while(j >= 0 && _books[j].compareTitle(insert) > 0) {
        _books[j+1] = _books[j];
        j--;
      }
      _books[j+1] = insert;
    }
  }

  module.exports = InsertionSort;
