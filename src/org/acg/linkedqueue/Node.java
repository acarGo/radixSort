package org.acg.linkedqueue;

	public class Node<T> {
		public T data; 			// dato del nodo
		public Node<T> next; 	// puntero al siguiente nodo de la lista, null si
								// �ltimo
		// -------------------------------------------------------------

		public Node(T dd) 		// constructor
		{
			data = dd;
			next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T pData) {
			data = pData;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> pNext) {
			next = pNext;
		}
		
		
	}


