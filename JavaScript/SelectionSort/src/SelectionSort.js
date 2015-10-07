
  function SelectionSort(){};

  SelectionSort.byAuthor = function(_books) {
    for(var i = 0; i < _books.length; i++) {
      var minIndex = i;
      for(var j = i+1; j < _books.length; j++) {
        if(_books[j].compareAuthor(_books[minIndex]) < 0) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        SelectionSort.swapBooks(_books, i, minIndex);
      }
    }
  }

  SelectionSort.byNumberPages = function(_books) {
    for(var i = 0; i < _books.length; i++) {
      var minIndex = i;
      for(var j = i+1; j < _books.length; j++) {
        if(_books[j].compareNumberPages(_books[minIndex]) < 0) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        SelectionSort.swapBooks(_books, i, minIndex);
      }
    }
  }

  SelectionSort.byTitle = function(_books) {
    for(var i = 0; i < _books.length; i++) {
      var minIndex = i;
      for(var j = i+1; j < _books.length; j++) {
        if(_books[j].compareTitle(_books[minIndex]) < 0) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        SelectionSort.swapBooks(_books, i, minIndex);
      }
    }
  }

  SelectionSort.swapBooks = function(_books, _swap1, _swap2) {
    var temp = _books[_swap1];
    _books[_swap1] = _books[_swap2];
    _books[_swap2] = temp;
  }

  module.exports = SelectionSort;
