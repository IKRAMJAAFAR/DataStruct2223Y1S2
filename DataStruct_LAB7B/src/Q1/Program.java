/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;
import java.util.*;
/**
 *
 * @author weare
 */
public class Program {
    static PriorityQueue<Integer> queue = new PriorityQueue<>();
    static Integer[] array = {4, 8, 1, 2, 9, 6, 3, 7};
    public static void main(String[] args) {
        addElQ();
        
        //toString
        System.out.println("toString");
        displayQ();
        
        //Poll
        System.out.println("Polling: " + queue.poll());
        displayQ();  
        
        //Add
        System.out.println("\nAdd");
        queue.add(5);
        displayQ();
        
        //toArray
        System.out.println("\ntoArray");
        Integer[] temp = (Integer[]) queue.toArray(array);
        System.out.println(Arrays.toString(arrayQ()));
        
        //peek
        System.out.println("");
        System.out.println("Peek: " + queue.peek());
        
        //contains
        System.out.println("Contains 1: " + queue.contains(1));
        
        //size
        System.out.println("Size: " + queue.size());
        
        //isEmpty
        System.out.println("");
        System.out.println("isEmpty");
        displayQ();
        do{
            queue.poll();
            displayQ();
        }while(!queue.isEmpty());
        
        //Reverse
        System.out.println("");
        queue = new PriorityQueue(Collections.reverseOrder());
        addElQ();
        displayQ();
        
    }
    
    public static void displayQ() {
        System.out.println(queue.toString());
    }
    public static Integer[] arrayQ(){
        return (Integer[]) queue.toArray(array);
    }
    public static void addElQ(){
        for(Integer a:array){
            System.out.println(queue.offer(a));
        }
    }

}

