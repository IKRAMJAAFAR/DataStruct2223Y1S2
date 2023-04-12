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
public interface BP_MyLinkedList<E> {
    
    
    
    /**
     * 
     * @param e
     * @return true if list contains the element e 
     */
    public boolean contains(E e);
    
    /**
     * 
     * @param index
     * @return element at the specified index
     */
    public E get(int index);
    
    /**
     * 
     * @return the value of the first item
     */
    public E getFirst();
    
    /**
     * 
     * @return the value of the last item
     */
    public E getLast();

    /**
     * 
     * @param e
     * @return the index of the head matching element in this list.
     *  if no match, -1.
     */
    public int indexOf(E e);
    
    /**
     * 
     * @param e
     * @return Return the index of the last matching element in this list. 
     *  Return -1 of no match
     */
    public int lastIndexOf(E e);

    /**
     * 
     * @param index
     * @param e
     * @return Replace the element at the specified position in this list with the specified element
     */
    public E set(int index,E e);
    
    /** 
     * Clear the list
     */
    public void clear();
    
    /**
     * Print all elements in the list
     */
    public void print();
    
    /**
     * Print all elements in the list in reverse order
     */
    public void reverse();



}
