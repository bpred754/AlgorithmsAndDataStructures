#ifndef SRC_NODE_H_
#define SRC_NODE_H_

template<typename T>
class Node {
	private:
		Node* next;
		T data;
	public:
		Node(T _data) : data(_data){
			next = 0x0;
		}

	    T getData() const {
	    	return data;
	    }

		Node* getNext() const {
			return next;
		}

		void setNext(Node* _next) {
			next = _next;
		}
};

#endif /* SRC_NODE_H_ */
