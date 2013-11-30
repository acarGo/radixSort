package org.acg.linkedqueue;

public class QueueLinked<T> implements QueueADT<T>{
	private Node<T> front;
	private Node<T> rear;
	
	private int count;
	
	public QueueLinked(){
		front = null;
		rear = null;
		count = 0;
	}

	public Node<T> getFront() {
		return front;
	}

	public void setFront(Node<T> pFront) {
		front = pFront;
	}

	public Node<T> getRear() {
		return rear;
	}

	public void setRear(Node<T> pRear) {
		rear = pRear;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int pCount) {
		count = pCount;
	}

	@Override
	public void insert(T pElement) {
		Node<T> newLink = new Node<T>(pElement);
		if (isEmpty())
			front = newLink;
		else
			rear.setNext(newLink);
		rear = newLink;
		count++;
	}

	@Override
	public T remove() {
		T temp = front.getData();
		if(front.getNext() == null)
			rear = null;
		front = front.getNext();
		count--;
		return temp;
	}

	@Override
	public T first() {
		return front.getData();
	}

	@Override
	public boolean isEmpty() {
		return front == null;
	}

	@Override
	public int size() {
		return count;
	}
	
}
