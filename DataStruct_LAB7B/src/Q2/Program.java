/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author weare
 */
import java.util.*;
public class Program {
    static String[][] array = 
        {
            {"George", "Jim", "John","Blake", "Kevin", "Michael"},
            {"George", "Katie", "Kevin", "Michelle", "Ryan"}
        };
    static PriorityQueue<String> queue1 = new PriorityQueue<>();
    static PriorityQueue<String> queue2 = new PriorityQueue<>();
    
    public static void addElQ(){
        queue1.addAll(Arrays.asList(array[0]));
        queue2.addAll(Arrays.asList(array[1]));
    }
    
    public static void main(String[] args) {
        addElQ();
        System.out.println("Priority Queue 1 - " + queue1.toString());
        System.out.println("Priority Queue 2 - " + queue2.toString());
        System.out.println("");
        
        System.out.println("Union");
        System.out.println(union().toString());
        System.out.println("");
        
        System.out.println("Difference");
        System.out.println(difference().toString());
        System.out.println("");
        
        System.out.println("Intersection");
        System.out.println(intersection().toString());
        
        
    }
    
    public static PriorityQueue<String> union(){
        PriorityQueue<String> queueUnion = new PriorityQueue<>();
        for(String temp:queue1){
            if(!queueUnion.contains(temp))
                queueUnion.add(temp);
        }
        for(String temp:queue2){
            if(!queueUnion.contains(temp))
                queueUnion.add(temp);
        }
        return queueUnion;
    }
    public static PriorityQueue<String> unionNew(){
        Set<String> set = new HashSet<>(queue1);
        set.addAll(queue2);
        return new PriorityQueue<>(set);
    }
    
    public static PriorityQueue<String> difference(){
        PriorityQueue<String> queueDif = new PriorityQueue<>();
        PriorityQueue<String> queueInt = intersection();
        for(String temp:queue1){
            if(!queueInt.contains(temp))
                queueDif.add(temp);
        }
        return queueDif;
    }

    public static PriorityQueue<String> intersection(){
        PriorityQueue<String> queueInt = new PriorityQueue<>();
        queue1.stream().filter(temp -> (queue2.contains(temp) && !queueInt.contains(temp))).forEachOrdered(temp -> {
            queueInt.add(temp);
        });
            return queueInt;
    }

}
