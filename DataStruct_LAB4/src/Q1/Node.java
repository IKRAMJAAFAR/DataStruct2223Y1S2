/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author weare
 */
public class Node<T> {
    Node<T> next;
    T element;
    
    public Node(){
        element = null;
        next = null;
    }
    
    public Node(T element){
        this.element = element;
        next = null;
    }
    
}
