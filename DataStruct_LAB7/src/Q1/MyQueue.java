/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

import java.util.*;

/**
 *
 * @author weare
 * @param <E>
 */
public class MyQueue<E> implements IMyQueue<E> {

    private final LinkedList<E> list = new LinkedList<>();
    
    public MyQueue(E[] e){
        list.addAll(Arrays.asList(e));
    }
    public MyQueue(){
        
    }
    
    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E dequeue() {
        if(getSize() <= 0)
            return null;
        else{
            return list.removeFirst();
        }
    }

    @Override
    public E getElement(int i) {
        if(i >= getSize() || isEmpty())
            return null;
        else
            return list.get(i);
    }

    @Override
    public E peek() {
        return getElement(0);
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }
    
    @Override
    public String toString() {
        return Arrays.deepToString(list.toArray());
    }
    
    
    
}
