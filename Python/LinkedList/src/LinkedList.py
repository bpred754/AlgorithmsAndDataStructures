
from Node import Node

class LinkedList:
    def __init__(self):
        self.__head = None
        self.__tail = None
        self.__numberNodes = 0

    # Insert element at the end of the list
    def add(self, data):
        addNode = Node(data)
        # Set head and tail to new pointer if list is empty
        if self.__head is None:
            self.__head = addNode
            self.__tail = addNode
        else:
            self.__tail.setNext(addNode) # Set tail's next pointer to new node
            self.__tail = self.__tail.getNext() # Set tail to new node
        self.__numberNodes = self.__numberNodes + 1

    # Insert element at the specified index
    def addAtIndex(self, index, data):
        # Continue if index is valid
        if index >= 0 and index <= self.__numberNodes:
            if index == 0: # Push element to front of list if index is 0
                self.push(data)
            elif index == self.__numberNodes: # Add element to end of list if index is last element
                self.add(data)
            else:
                # Continue if list is not empty
                if self.__head is not None and self.__tail is not None:
                    addNode = Node(data)
                    currentNode = self.__head.getNext()
                    previousNode = self.__head

                    count = 1
                    while (currentNode is not None): # Traverse list to find element at index
                        # Insert element when index is found
                        if count == index:
                            previousNode.setNext(addNode)
                            addNode.setNext(currentNode)
                            self.__numberNodes = self.__numberNodes + 1
                            break
                        # Prepare for next iteration
                        previousNode = currentNode;
                        currentNode = currentNode.getNext();
                        count = count + 1

    def get(self, index):
        returnNode = None
        # Traverse list for element at index if list is not empty and index is valid
        if self.__head is not None and index >= 0 and index < self.__numberNodes:
            count = 0
            currentNode = self.__head
            # Set return node if current node count matches index
            if count == index:
                returnNode = currentNode
            # Prepare for next iteration
            currentNode = currentNode.getNext();
            count = count + 1
            while(currentNode is not None):
                # Set return node if current node count matches index
                if count == index:
                    returnNode = currentNode
                # Prepare for next iteration
                currentNode = currentNode.getNext();
                count = count + 1
            return returnNode.getData();

    # Insert element at the beginning of the list
    def push(self, data):
        addNode = Node(data)
        # Set head and tail to new pointer if list is empty
        if self.__head is None:
            self.__head = addNode
            self.__tail = addNode
        else:
            addNode.setNext(self.__head) # Set new node's next pointer to the current head
            self.__head = addNode  # Set head to new node
        self.__numberNodes = self.__numberNodes + 1

    # Remove element at specified index
    def remove(self, index):
        # Continue if list is not empty and index is valid
        if self.__head is not None and index >= 0 and index < self.__numberNodes:
            # Logic to remove first element
            if index == 0:
                tempNode = self.__head
                self.__head = self.__head.getNext() # Move head pointer to next node
                tempNode.setNext(None) # Remove initial head reference
            else: # Logic to remove other elements
                currentNode = self.__head.getNext()
                previousNode = self.__head

                count = 1;
                while(currentNode is not None):
                    if count == index:
                        previousNode.setNext(currentNode.getNext())
                        #Set tail pointer if index is last element
                        if index == self.__numberNodes-1:
                            self.__tail = previousNode
                    # Prepare for next iteration
                    previousNode = currentNode
                    currentNode = currentNode.getNext()
                    count = count + 1
            self.__numberNodes = self.__numberNodes - 1

    def toString(self):
        returnString = ""
        count = 0
        currentNode = self.__head
        while(currentNode is not None):
            returnString = returnString +  "List Item: " + str(count) + "\n" + currentNode.getData().toString()
            currentNode = currentNode.getNext()
            count = count + 1
        return returnString
