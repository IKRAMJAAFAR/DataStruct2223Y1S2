/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author weare
 */
import java.util.LinkedList;
public class Test_Q1 {
    public static void main(String[] args) throws InterruptedException{
        Node<Character> head = null;
        Node<Character> tail = null;
        LinkedList list = new LinkedList();
        list.addFirst(head);
        
        Node<Character> N1 = new Node<>('a');
        head = N1;
        tail = head;
        
        Node<Character> N2 = new Node<>('z');
        tail.next = N2;
        tail = tail.next;
        
        display(head);
        
        Node<Character> nodeFirst = new Node<>('Q');
        nodeFirst.next = head;
        head = nodeFirst;
        if(tail == null){
            tail = head;
        }
        
        display(head);
        
        Node<Character> nodeLast = new Node<>('c');
        tail.next = nodeLast;
        tail = tail.next;
        display(head);
       
        
        
        
    }
    
    public static void display(Node<Character> head) throws InterruptedException {
        Node<Character> current = head;
        while(current != null){
            System.out.println(current.element);
            current = current.next;
        }
        java.util.concurrent.TimeUnit.SECONDS.sleep(1);
    }
    
    public static <E> void addFirst(E e){
    }
}
