/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.ArrayList;

/**
 *
 * @author weare
 * @param <E>
 */
public class MyLinkedList<E> implements BP_MyLinkedList<E> {
    Node<E> head = null;
    Node<E> tail = null;
    
    public MyLinkedList(){
        
    }
    
    public void addFirst(E e){
        Node<E> nodeFirst = new Node<>(e);
        nodeFirst.next = head;
        head = nodeFirst;
        if(tail == null){
            tail = head;
        }
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
    }
    
    public void add(int index, E e){
        Node<E> nodeNew = new Node<>(e);
        Node<E> current = head;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
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
        }
    }
    
    public E removeFirst(){
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
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
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
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
                current = head;
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
        Node<E> temp = head;
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        if(index < 0 ||index >= size)
            return null;
        else if(index == 0)
            removeFirst();
        else if(index == size - 1)
            removeLast();
        else{
            index--;
            for(int i = 0;i < index;i++){
                if(i < index - 1){
                    temp = temp.next;
                }
                previous = previous.next;
            }
            temp.next = previous.next;
            size--;
        }
        return previous.element;
    }

    @Override
    public boolean contains(E e) {
        return this.indexOf(e) != -1;
    }

    @Override
    public E get(int index) {
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        if(index < 0 || index >= size)
            return null;
        else{
            current = head;
            for(int i = 0; i < index;i++){
                current = current.next;
            }
        }
        return current.element;
    }

    @Override
    public E getFirst() {
        if(head == null)
            return null;
        else
            return head.element;
    }

    @Override
    public E getLast() {
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        switch (size) {
            case 0 -> {
                return null;
            }
            case 1 -> {
                return head.next.element;
            }
            default -> {
                current = head;
                for(int i = 0; i < size - 1;i++){
                    current = current.next;
                }
                return current.element;
            }
        }
    }

    @Override
    public int indexOf(E e) {
        Node<E> current = head;
        int index = 0;
        while(current != null){
            if(current.element == e){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        int last = -1, count = 0;
        Node<E> current = head;
        while(current != null){
            if(current.element == e){
                last = count;
            }
            count++;
            current = current.next;
        }
        return last;
    }

    @Override
    public E set(int index, E e) {
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        if(index >= size || index < 0)
            return null;
        else if(size == 1 && index == 0){
            head.element = e;
            return head.element;
        }
        else{
            current = head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            current.element = e;
            return current.element;
        }
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public void print() {
        Node<E> current = head;
        while(current != null){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println("");
    }

    @Override
    public void reverse() {
        ArrayList<E> array = new ArrayList();
        Node<E> current = head;
        while(current != null){
            array.add(current.element);
            current = current.next;
        }
        for(int count = array.size() - 1;count >= 0;count--){
            System.out.print(array.get(count) + " ");
        }
        System.out.println("");
    }
    
    public E getMiddleValue(){
        int size = 0;
        Node<E> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        switch(size){
            case 0 -> {
                return null;
            }
            case 1 -> {
                return head.element;
            }
            default -> {
                int middle = size / 2;
                java.util.Random rand = new java.util.Random();
                middle = (size%2==0) ? (middle-rand.nextInt(2)):middle;
                current = head;
                for(int i=0;i < middle;i++){
                    current = current.next;
                }
                return current.element;
            }
        }
    }
    
}
