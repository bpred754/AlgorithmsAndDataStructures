
var Node = require('./Node');

function LinkedList() {

  var self = this;
  self.head;
  self.tail;
  self.numberNodes = 0;

  // Insert element at the end of the list
	function add(_data) {

		var addNode = new Node(_data);

		// Set head and tail to new pointer if list is empty
		if(!self.head) {
			self.head = addNode;
			self.tail = addNode;
		} else {
			self.tail.setNext(addNode); // Set tail's next pointer to new node
			self.tail = self.tail.getNext(); // Set tail to new node
		}

		self.numberNodes++;
	}

  // Insert element at the specified index
	function addAtIndex(_index, _data) {

		// Continue if _index is valid
		if(_index >= 0 && _index <= self.numberNodes) {

			if(_index == 0) { // Push element to front of list if _index is 0
				self.push(_data);
			} else if(_index == self.numberNodes) { // Add element to end of list if index is last element
				self.add(_data);
			} else {

				// Continue if list is not empty
				if(self.head && self.tail) {

					var addNode = new Node(_data);
					var currentNode = self.head.getNext();
					var previousNode = self.head;

					var count = 1;
					while(currentNode) { // Traverse list to find element at _index

						// Insert element when _index is found
						if(count == _index) {
							previousNode.setNext(addNode);
							addNode.setNext(currentNode);
							self.numberNodes++;
							break;
						}

						// Prepare for next iteration
						previousNode = currentNode;
						currentNode = currentNode.getNext();
						count++;
					}
				}
			}
		}
	}

  // Get element at the specified index
	function get(_index) {

		var returnNode;

		// Traverse list for element at index if list is not empty and _index is valid
		if(self.head && _index >= 0 && _index < self.numberNodes) {
			var count = 0;
			var currentNode = self.head;
			do { // Execute do logic at least once

				// Set return node if current node count matches _index
				if(count == _index) {
					returnNode = currentNode;
				}

				// Prepare for next iteration
				currentNode = currentNode.getNext();
				count++;
			}
			while(currentNode);
		}
		return returnNode.getData();
	}

  // Insert element at the beginning of the list
	function push(_data) {

		var addNode = new Node(_data);

		// Set head and tail to new pointer if list is empty
		if(!self.head) {
			self.head = addNode;
			self.tail = addNode;
		} else {
			addNode.setNext(self.head); // Set new node's next pointer to the current head
			self.head = addNode;  // Set head to new node
		}

		self.numberNodes++;
	}

  // Remove element at specified index
	function remove(_index) {

		// Continue if list is not empty and _index is valid
		if(self.head && _index >= 0 && _index < self.numberNodes) {

			// Logic to remove first element
			if(_index == 0) {
				var tempNode = self.head;
				self.head = self.head.getNext(); // Move head pointer to next node
				tempNode.setNext(null); // Remove initial head reference
			} else { // Logic to remove other elements

				var currentNode = self.head.getNext();
				var previousNode = self.head;

				var count = 1;
				while(currentNode) {

					if(count == _index) {
						previousNode.setNext(currentNode.getNext());

						// Set tail pointer if _index is last element
						if (_index == self.numberNodes-1) {
							self.tail = previousNode;
						}
					}

					// Prepare for next iteration
					previousNode = currentNode;
					currentNode = currentNode.getNext();
					count++;
				}
			}
			self.numberNodes--;
		}
	}

  function toString() {
    var returnString = "";

		var count = 0;
		var currentNode = self.head;
		while(currentNode) {
			returnString += "List Item: " + count + "\n" + currentNode.getData().toString();
			currentNode = currentNode.getNext();
			count++;
		}
		return returnString;
  }

  return {
    add: add,
    addAtIndex: addAtIndex,
    get: get,
    push: push,
    remove: remove,
    toString: toString
  }
}

module.exports = LinkedList;
