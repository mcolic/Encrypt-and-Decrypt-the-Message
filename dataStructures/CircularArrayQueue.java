package dataStructures;

import dataStructures.exceptions.*;
import java.util.Iterator;

public class CircularArrayQueue<T> implements QueueADT<T> 
{
	private final int DEFAULT_CAPACITY = 100;
	private int head, tail, count;
	private T[] queue;

	/**
	* Creates an empty queue using the default capacity.
	*/


	public CircularArrayQueue()
	{
		head = tail = count = 0;
		queue = (T[]) (new Object [DEFAULT_CAPACITY]);
	}

	/** 
	 * Creates an empty queue using the specified capacity.
	 *
	 * @param initialCapacity the integer representation of the initial
	 *                            size of the circular array queue
	 */


	public CircularArrayQueue (int initialCapacity)

	{
		head = tail = count = 0;
		queue = ( (T[]) (new Object[initialCapacity]));
	}


/**
     * Adds the specified element to the rear of this queue, expanding
     * the capacity of the queue array if necessary.
     * @param element the element to add to the rear of the queue
     */
    public void enqueue(T element)
    {
        if (size() == queue.length) 
            expandCapacity();
    
        queue[rear] = element;
        rear = (rear+1) % queue.length;
    
        count++;
    }
	
	/**
     * Creates a new array to store the contents of this queue with
     * twice the capacity of the old one.
     */
    private void expandCapacity()
    {
        T[] larger = (T[]) (new Object[queue.length *2]);
    
        for (int scan = 0; scan < count; scan++)
        {
            larger[scan] = queue[front];
            front = (front + 1) % queue.length;
        }
    
        front = 0;
        rear = count;
        queue = larger;
    }
	
    /**
     * Removes the element at the front of this queue and returns a
     * reference to it. 
	 * @return the element removed from the front of the queue
     * @throws EmptyCollectionException  if the queue is empty
     */
    public T dequeue() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("queue");
    
        T result = queue[front];
        queue[front] = null;
        front = (front+1) % queue.length;
    
        count--;
    
        return result;
    }
  
    /** 
     * Returns a reference to the element at the front of this queue.
     * The element is not removed from the queue.  
     * @return the first element in the queue
     * @throws EmptyCollectionException if the queue is empty
     */
    public T first() throws EmptyCollectionException
    {
        // To be completed as a Programming Project
    }
  
    /**
     * Returns true if this queue is empty and false otherwise.
     * @return true if this queue is empty 
     */
    public boolean isEmpty()
    {
        // To be completed as a Programming Project
    }
  
    /**
     * Returns the number of elements currently in this queue.
     * @return the size of the queue
     */
    public int size()
    {
        // To be completed as a Programming Project
    }
  
    /**
     * Returns a string representation of this queue. 
     * @return the string representation of the queue
     */
    public String toString()
    {
        // To be completed as a Programming Project
    }
}
}