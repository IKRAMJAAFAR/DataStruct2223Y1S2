/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

import java.util.*;

/**
 *
 * @author weare
 * @param <T>
 */
public class Container <T>{

    private T t;
    
    public Container() {
        t = null;
    }
    
    public void set(T parameter){
        t = parameter;
    }
    
    public T retrieve(){
        return t==null ? (T) "Error":t;
    }
    
    public static void main(String[] args) {
        Container<Integer> con1 = new Container<>();
        Container<String> con2 = new Container<>();
        
        con1.set(50);
        con2.set("Java");
        
        System.out.println("con1 = " + con1.retrieve());
        System.out.println("con2 = " + con2.retrieve());
        
        
    }
    
}
