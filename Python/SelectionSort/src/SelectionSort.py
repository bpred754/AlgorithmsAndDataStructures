class SelectionSort:

    @staticmethod
    def byAuthor(books):
        booksLength = len(books)
        for index in range(booksLength):
            minIndex = index
            for j in range(index+1, booksLength):
                if books[j].compareAuthor(books[minIndex]) < 0:
                    minIndex = j
            if minIndex != index:
                SelectionSort.swapBooks(books, index, minIndex)

    @staticmethod
    def byNumberPages(books):
        booksLength = len(books)
        for index in range(booksLength):
            minIndex = index
            for j in range(index+1, booksLength):
                if books[j].compareNumberPages(books[minIndex]) < 0:
                    minIndex = j
            if minIndex != index:
                SelectionSort.swapBooks(books, index, minIndex)

    @staticmethod
    def byTitle(books):
        booksLength = len(books)
        for index in range(booksLength):
            minIndex = index
            for j in range(index+1, booksLength):
                if books[j].compareTitle(books[minIndex]) < 0:
                    minIndex = j
            if minIndex != index:
                SelectionSort.swapBooks(books, index, minIndex)

    @staticmethod
    def swapBooks(books, swap1, swap2):
        temp = books[swap1]
        books[swap1] = books[swap2]
        books[swap2] = temp
