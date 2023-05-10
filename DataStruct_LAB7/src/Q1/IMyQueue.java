/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Q1;

/**
 *
 * @author weare
 * @param <E>
 */
public interface IMyQueue<E> {
    
    /**
     * Adding new element into the queue
     * @param e new element to be added
     */
    public void enqueue(E e);
    
    
    /**
     * Removing the element at the head in the queue
     * @return null if queue is empty, else the element from the head and removes it
     */
    public E dequeue();
    
    /**
     * Getting the element contains in the queue in the certain position/index
     * @param i index of the queue
     * @return null if out of bounds, else the element to be find at index i 
     */
    public E getElement(int i);
    
    /**
     * Checking the first element / head in the queue
     * @return null if empty, else the element in the first position/ index 0
     */
    public E peek();
    
    /**
     * Counting the total elements contains in the queue
     * @return the size of the queue or total elements contain in the queue
     */
    public int getSize();
    
    
    /**
     * Checking if the wanted element exists in the queue
     * @param e the element to be checked
     * @return false if the element e is not in the list, else true
     */
    public boolean contains(E e);
    
    /**
     * Checking if the queue is empty
     * @return true if getSize() == 0 else false
     */
    public boolean isEmpty();
    
    /**
     * Generating a string what contains in the queue
     * @return the string containing the elements in the queue in order
     */
    @Override
    public String toString();
    
}
