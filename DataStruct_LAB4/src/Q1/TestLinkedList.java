/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author weare
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        for(char test = 'a';test <= 'e';test++){
            list.addLast(test);
        }
        System.out.print("Display: ");
        list.print();
        System.out.print("Reverse: ");
        list.reverse();
        int size = list.indexOf(list.getLast()) + 1;
        System.out.println("Size: " + size);
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Middle value: " + list.getMiddleValue());
        System.out.println("");
        
        
        System.out.println("Remove 3rd: " + list.remove(3));
        System.out.print("Display: ");
        list.print();
        System.out.println("Middle value: " + list.getMiddleValue());
        System.out.println("Index of 'b': " + list.indexOf('b'));
        System.out.println("Index of 'c': " + list.indexOf('c'));
        System.out.println("Contains 'c' ?: " + list.contains('c'));
        System.out.println("");
        
        
        String java = "java";
        for(int i = 0;i < java.length();i++){
            list.set(i, java.charAt(i));
        }
        System.out.println("Replacing with \"java\"");
        System.out.print("The list: ");
        list.print();
        System.out.println("Middle value: " + list.getMiddleValue());
        
    }
}
