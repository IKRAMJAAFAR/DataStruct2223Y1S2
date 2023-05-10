/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import Q1.MyQueue;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author weare
 */
public class Palidrome {
    static MyQueue<Character> queue;
    static String input; 
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert a string");
        input = s.nextLine();
        Character[] temp = new Character[input.length()];
        for(int i = 0;i < temp.length;i++){
            temp[i] = input.charAt(i);
        }
        queue = new MyQueue<>(temp);
        System.out.println("Palidrome: " + check());
    }
    
    public static boolean check() {
        for(int i = 0;!queue.isEmpty();i++){
            Character inCheck = input.charAt(input.length() - 1 - i);
            Character quCheck = queue.dequeue();
            if(!Objects.equals(inCheck, quCheck))
                return false;
        }
        return true;
    }
}
