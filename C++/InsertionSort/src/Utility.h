#ifndef UTILITY_H
#define UTILITY_H

#ifdef WIN32
#include <Windows.h>
#else
#include <sys/time.h>
#include <ctime>
#endif

#include <vector>
#include <string>
#include <sstream>

using std::string;
using std::vector;

typedef long long int64;
typedef unsigned long long uint64;

class Utility {

	private:
		// Function to split string by delimiter
		static vector<string> &split(const string &s, char delim, vector<string> &elems) {
			std::stringstream ss(s);
			string item;
			while (getline(ss, item, delim)) {
				elems.push_back(item);
			}
			return elems;
		}

	public:
		static int64 getTimeMs();
		static vector<string> split(const string &s, char delim);
};

#endif // UTILITY_H
