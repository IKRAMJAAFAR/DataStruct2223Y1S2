/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

import java.util.*;

/**
 *
 * @author weare
 */
public class ArrayBagDemo {
    private static <T> void displayBag(BagInterface<T> bag) {
        System.out.printf("The bag contains %d string(s), as follows:\n",bag.getCurrentSize());
        T[] result = bag.toArray();
        for(T check:result){
            System.out.print(check + " ");
        }
        System.out.println("\n");
    }
    
    private static void testAdd(BagInterface<String> bag,String[] content) {
        for(String input:content){
            if(!bag.add(input)){
                System.out.println("The bag is at maximum capacity.");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A","A","B","A","C","A"};
        String[] contentsOfBag2 = {"A","B","A","C","B","C","D","another string"};
                
        System.out.println("Bag 1");
        System.out.println("Adding A A B A C A ");
        testAdd(bag1,contentsOfBag1);
        displayBag(bag1);
        System.out.println("Bag 2");
        System.out.println("Adding A B A C B C D another string ");
        testAdd(bag2,contentsOfBag2);
        displayBag(bag2);
        
        System.out.println("Bag 3, test the method union of bag1 and bag2");
        BagInterface<String> bag3 = bag1.union(bag2);
        displayBag(bag3);
        
        System.out.println("Bag 4, test the method intersection of bag1 and bag2");
        BagInterface<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);
        
        System.out.println("Bag 5, test the method difference of bag1 and bag2");
        BagInterface<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);
    }
}
