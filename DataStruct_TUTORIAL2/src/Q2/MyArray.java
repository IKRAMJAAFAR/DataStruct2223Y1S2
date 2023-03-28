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
public class MyArray {
    public static void main(String[] args) {
        ArrayList number = new ArrayList();
        for(int test = 1;test <=5;test++){
            number.add(test);
        }
        listAll(number);
        
        ArrayList name = new ArrayList();
        name.add("Jane");
        name.add("Tom");
        name.add("Bob");
        listAll(name);
        
        ArrayList character = new ArrayList();
        for(char test = 'a';test <='c';test++){
            character.add(test);
        }
        listAll(character);
    }
    
    public static <E> void listAll(E parameter) {
        System.out.println(parameter.toString());   
    }
}
