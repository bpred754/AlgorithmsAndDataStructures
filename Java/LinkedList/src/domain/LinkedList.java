package domain;

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int numberNodes = 0;
	
	// Get element at the specified index
	public T get(int _index) {
		
		Node<T> returnNode = null;
		
		// Traverse list for element at index if list is not empty and _index is valid
		if(this.head != null && _index >= 0 && _index < this.numberNodes) {
			int count = 0;
			Node<T> currentNode = this.head;
			do { // Execute do logic at least once
				
				// Set return node if current node count matches _index
				if(count == _index) {
					returnNode = currentNode;
				}
				
				// Prepare for next iteration
				currentNode = currentNode.getNext();
				count++;
			}
			while(currentNode != null);
		}
		return returnNode.getData();
	}
	
	// Insert element at the beginning of the list
	public void push(T _data) {
		
		Node<T> addNode = new Node<T>(_data);
		
		// Set head and tail to new pointer if list is empty
		if(this.head == null) {
			this.head = addNode;
			this.tail = addNode;
		} else {
			addNode.setNext(this.head); // Set new node's next pointer to the current head
			this.head = addNode;  // Set head to new node
		}
		
		this.numberNodes++;
	}
	
	// Insert element at the end of the list
	public void add(T _data) {
		
		Node<T> addNode = new Node<T>(_data);
		
		// Set head and tail to new pointer if list is empty
		if(this.head == null) {
			this.head = addNode;
			this.tail = addNode;
		} else {
			this.tail.setNext(addNode); // Set tail's next pointer to new node
			this.tail = this.tail.getNext(); // Set tail to new node
		}
		
		this.numberNodes++;
	}
	
	// Insert element at the specified index
	public void add(int _index, T _data) {
		
		// Continue if _index is valid
		if(_index >= 0 && _index <= this.numberNodes) {
			
			if(_index == 0) { // Push element to front of list if _index is 0
				this.push(_data);
			} else if(_index == this.numberNodes) { // Add element to end of list if index is last element 
				this.add(_data);
			} else {
				
				// Continue if list is not empty
				if(this.head != null && this.tail != null) {
					
					Node<T> addNode = new Node<T>(_data);
					Node<T> currentNode = this.head.getNext();
					Node<T> previousNode = this.head;
					
					int count = 1;
					while(currentNode != null) { // Traverse list to find element at _index
						
						// Insert element when _index is found
						if(count == _index) {
							previousNode.setNext(addNode);
							addNode.setNext(currentNode);
							this.numberNodes++;
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
	
	// Remove element at specified index
	public void remove(int _index) {
		
		// Continue if list is not empty and _index is valid
		if(this.head != null && _index >= 0 && _index < this.numberNodes) {
			
			// Logic to remove first element
			if(_index == 0) {
				Node<T> tempNode = this.head;
				this.head = this.head.getNext(); // Move head pointer to next node
				tempNode.setNext(null); // Remove initial head reference
			} else { // Logic to remove other elements
				
				Node<T> currentNode = this.head.getNext();
				Node<T> previousNode = this.head;
				
				int count = 1;
				while(currentNode != null) {
					
					if(count == _index) {
						previousNode.setNext(currentNode.getNext());
						
						// Set tail pointer if _index is last element
						if (_index == this.numberNodes-1) {
							this.tail = previousNode;
						} 
					}
					
					// Prepare for next iteration
					previousNode = currentNode;
					currentNode = currentNode.getNext();
					count++;
				}
			}
			this.numberNodes--;
		}
	}
	
	@Override
	public String toString() {
		
		String returnString = "";
		
		int count = 0;
		Node<T> currentNode = this.head;
		while(currentNode != null) {
			returnString += "List Item: " + count + "\n" + currentNode.getData().toString();
			currentNode = currentNode.getNext();
			count++;
		}
		return returnString;
	}
}
