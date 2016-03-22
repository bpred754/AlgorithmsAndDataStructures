#ifndef SRC_LINKEDLIST_H_
#define SRC_LINKEDLIST_H_

#include "Node.h"

template<typename T>
class LinkedList {
	private:
		Node<T>* head;
		Node<T>* tail;
		int numberNodes;
	public:
		//Constructor
		LinkedList() {
			head = 0x0;
			tail = 0x0;
			numberNodes = 0;
		}

		// Insert element at the end of the list
		void add(T _data) {

			Node<T>* addNode = new Node<T>(_data);

			// Set head and tail to new pointer if list is empty
			if(head == 0x0) {
				head = addNode;
				tail = addNode;
			} else {
				tail->setNext(addNode); // Set tail's next pointer to new node
				tail = tail->getNext(); // Set tail to new node
			}

			numberNodes++;
		}

		// Insert element at the specified index
		void add(int _index, T _data) {

			// Continue if _index is valid
			if(_index >= 0 && _index <= numberNodes) {

				if(_index == 0) { // Push element to front of list if _index is 0
					push(_data);
				} else if(_index == numberNodes) { // Add element to end of list if index is last element
					add(_data);
				} else {

					// Continue if list is not empty
					if(head != 0x0 && tail != 0x0) {

						Node<T>* addNode = new Node<T>(_data);
						Node<T>* currentNode = head->getNext();
						Node<T>* previousNode = head;

						int count = 1;
						while(currentNode != 0x0) { // Traverse list to find element at _index

							// Insert element when _index is found
							if(count == _index) {
								previousNode->setNext(addNode);
								addNode->setNext(currentNode);
								numberNodes++;
								break;
							}

							// Prepare for next iteration
							previousNode = currentNode;
							currentNode = currentNode->getNext();
							count++;
						}
					}
				}
			}
		}

		// Get element at the specified index
		T get(int _index) {

			Node<T>* returnNode = 0x0;

			// Traverse list for element at index if list is not empty and _index is valid
			if(head != 0x0 && _index >= 0 && _index < numberNodes) {
				int count = 0;
				Node<T>* currentNode = head;
				do { // Execute do logic at least once

					// Set return node if current node count matches _index
					if(count == _index) {
						returnNode = currentNode;
					}

					// Prepare for next iteration
					currentNode = currentNode->getNext();
					count++;
				}
				while(currentNode != 0x0);
			}
			return returnNode->getData();
		}

		// Insert element at the beginning of the list
		void push(T _data) {

			Node<T>* addNode = new Node<T>(_data);

			if(head == 0x0) {
				head = addNode;
				tail = addNode;
			} else {
				addNode->setNext(head);
				head = addNode;
			}
			numberNodes++;
		}

		// Remove element at specified index
		void remove(int _index) {

			// Continue if list is not empty and _index is valid
			if(head != 0x0 && _index >= 0 && _index < numberNodes) {

				// Logic to remove first element
				if(_index == 0) {
					Node<T>* tempNode = head;
					head = head->getNext(); // Move head pointer to next node
					tempNode->setNext(0x0); // Remove initial head reference
				} else { // Logic to remove other elements

					Node<T>* currentNode = head->getNext();
					Node<T>* previousNode = head;

					int count = 1;
					while(currentNode != 0x0) {

						if(count == _index) {
							previousNode->setNext(currentNode->getNext());

							// Set tail pointer if _index is last element
							if (_index == numberNodes-1) {
								tail = previousNode;
							}
						}

						// Prepare for next iteration
						previousNode = currentNode;
						currentNode = currentNode->getNext();
						count++;
					}
				}
				numberNodes--;
			}
		}

		string toString() {
			string returnString = "";

			int count = 0;
			Node<T>* currentNode = head;
			while(currentNode != 0x0) {
				returnString += "List Item: " + std::to_string(count) + "\n" + currentNode->getData().toString();
				currentNode = currentNode->getNext();
				count++;
			}
			return returnString;
		}
};

#endif /* SRC_LINKEDLIST_H_ */
