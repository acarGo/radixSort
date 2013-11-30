package org.acg.linkedqueue;

public interface QueueADT<T> {
	
	public void insert(T element);
	
	public T remove();
	
	public T first();
	
	public boolean isEmpty();
	
	public int size();
	
}
