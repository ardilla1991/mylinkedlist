package by.htp.mylinkedlist;

public class MyLinkedList<T> {
	
	public int size;
	public Node<T> first;
	public Node<T> tail;

	class Node<T>{
		public T element;
		public Node<T> prev;
		public Node<T> next;
		
		public Node() {
			super();
		}
		
		public Node(T element, Node<T> next, Node<T> prev) {
	        this.element = element;
	        this.next = next;
	        this.prev = prev;
	    }

		@Override
		public String toString() {
			return "Node [element=" + element + "]";
		}
		
		
	}

	public void add(T obj) {
		System.out.println("add");
		Node<T> newNode = new Node(obj, null, null);
		if ( first == null ) {
			first = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	@Override
	public String toString() {
		return "MyLinkedList [size=" + size + ", first=" + first.toString() + ", tail="
				+ tail.toString() + "]";
	}
	
	
}



