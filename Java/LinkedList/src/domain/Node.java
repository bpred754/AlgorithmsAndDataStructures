package domain;

public class Node<T> {
	
	private Node<T> next;
	private T data;
	
	public Node(T _data) {
		this.data = _data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public void setNext(Node<T> _next) {
		this.next = _next;
	}
}
