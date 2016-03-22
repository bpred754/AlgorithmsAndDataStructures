
class Node:
    def __init__(self, data):
        self.__next = None
        self.__data = data

    def getData(self):
        return self.__data

    def getNext(self):
        return self.__next

    def setNext(self, next):
        self.__next = next
