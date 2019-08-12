package day19;

public class Node<E> {
	E data;
	Node<E> next;
	
	public Node(E data, Node<E> next) {
		super();
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}
