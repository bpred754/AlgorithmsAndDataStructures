class InsertionSort:

    @staticmethod
    def byAuthor(books):
        booksLength = len(books)
        for index in range(booksLength):
            j = index - 1
            insert = books[index]
            while (j >= 0 and books[j].compareAuthor(insert) > 0):
                books[j+1] = books[j]
                j = j - 1
            books[j+1] = insert

    @staticmethod
    def byNumberPages(books):
        booksLength = len(books)
        for index in range(booksLength):
            j = index - 1
            insert = books[index]
            while (j >= 0 and books[j].compareNumberPages(insert) > 0):
                books[j+1] = books[j]
                j = j - 1
            books[j+1] = insert

    @staticmethod
    def byTitle(books):
        booksLength = len(books)
        for index in range(booksLength):
            j = index - 1
            insert = books[index]
            while (j >= 0 and books[j].compareTitle(insert) > 0):
                books[j+1] = books[j]
                j = j - 1
            books[j+1] = insert
