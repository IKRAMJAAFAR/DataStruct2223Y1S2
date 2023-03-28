/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author weare
 */
public class testQ3 {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);
        
        StorePairGeneric<Integer>[] all = new StorePairGeneric[3];
        all[0] = a;
        all[1] = b;
        all[2] = c;
        for(StorePairGeneric<Integer> list: all){
            System.out.println(list.toString());
            System.out.println("Comparison?");
            System.out.println(list.compareTo());
            System.out.println("Equals?");
            System.out.println(list.equals());
            System.out.println("");
        }
        
    }
}
