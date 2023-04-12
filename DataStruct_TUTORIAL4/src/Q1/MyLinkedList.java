/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author weare
 */

public class MyLinkedList<E> {

    Node<E> head = null;
    Node<E> tail = null;
    private int size = 0;
    
    public MyLinkedList(){
        
    }
    
    public void addFirst(E e){
        Node<E> nodeFirst = new Node<>(e);
        nodeFirst.next = head;
        head = nodeFirst;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    
    public void addLast(E e){
        Node<E> nodeLast = new Node<>(e);
        if(head == null){
            head = nodeLast;
            tail = head;
        }
        else{
            tail.next = nodeLast;
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, E e){
        Node<E> nodeNew = new Node<>(e);
        Node<E> current = head;
        if(index >= size){
            for(int i = 1;i < size - index;i++){
                addLast(null);
            }
            addLast(e);
        }
        else if(index == 0){
            addFirst(e);
        }
        else{
            for(int i = 1;i < index;i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = nodeNew;
            (current.next).next = temp;
            size++;
        }
    }
    
    public E removeFirst(){
        if(size == 0)
            return null;
        else{
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null){
                tail = null;
            }
            return temp.element;
        }
    }
    
    public E removeLast(){
        switch (size) {
            case 0 -> {
                return null;
            }
            case 1 -> {
                Node<E> temp = head.next;
                head = tail = null;
                size--;
                return temp.element;
            }
            default -> {
                Node<E> current = head;
                for(int i = 1; i <= size - 2;i++){
                    current = current.next;
                }
                Node<E> temp = tail;
                tail = current;
                tail.next = null;
                size--;
                return temp.element;
                
            }
        }
    }
    
    public E remove(int index){
        Node<E> previous = head;
        if(index < 0 ||index >= size)
            return null;
        else if(index == 0)
            removeFirst();
        else if(index == size - 1)
            removeLast();
        else{
            for(int i = 1;i < index;i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
        }
        return previous.element;
    }
    
}
