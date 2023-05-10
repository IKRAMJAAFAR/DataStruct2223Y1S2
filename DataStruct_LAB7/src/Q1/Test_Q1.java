/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author weare
 */
public class Test_Q1 {
    public static void main(String[] args) {
        String[] test = {"Durian","Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(test);
        String[] testnew = {"Apple","Orange","Grapes","Cherry"};
        for(String temp: testnew){
            fruitQ.enqueue(temp);
        }
        System.out.println("Top: " + fruitQ.peek());
        System.out.println("Size: " + fruitQ.getSize());
        System.out.println("Remove: " + fruitQ.dequeue());
        System.out.println("2nd: " + fruitQ.getElement(2));
        System.out.println("Cherry?: " + fruitQ.contains("Cherry"));
        System.out.println("Durian?: " + fruitQ.contains("Durian"));
        if(fruitQ.isEmpty())
            System.out.println("Display: empty");
        else
            System.out.println("Display: " + fruitQ.toString());
    }
}
