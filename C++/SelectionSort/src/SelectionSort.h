#ifndef SELECTIONSORT_H
#define SELECTIONSORT_H

#include"Book.h"

#include <vector>
using std::vector;

class SelectionSort {

	public:
		static void byAuthor(vector<Book>&);
		static void byNumberPages(vector<Book>&);
		static void byTitle(vector<Book>&);
		static void swapBooks(vector<Book>&, int, int);
};

#endif // SELECTIONSORT_H
