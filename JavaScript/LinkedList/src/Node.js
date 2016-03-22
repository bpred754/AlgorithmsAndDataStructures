
  function Node(_data) {

    var self = this;
    self.data = _data;
    self.next;

    function getData() {
      return self.data;
    }

    function getNext() {
      return self.next;
    }

    function setNext(_next) {
      self.next = _next;
    }

    return {
      getData: getData,
      getNext: getNext,
      setNext: setNext
    }
  }

  module.exports = Node;
