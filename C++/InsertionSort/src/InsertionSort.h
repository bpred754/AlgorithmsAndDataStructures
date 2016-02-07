#ifndef SRC_INSERTIONSORT_H_
#define SRC_INSERTIONSORT_H_

#include"Book.h"

#include <vector>
using std::vector;

class InsertionSort {

	public:
		static void byAuthor(vector<Book>&);
		static void byNumberPages(vector<Book>&);
		static void byTitle(vector<Book>&);
};

#endif /* SRC_INSERTIONSORT_H_ */
