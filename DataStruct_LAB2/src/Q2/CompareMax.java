/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author weare
 */
public class CompareMax {
    public static <E extends Comparable<E>> E maximum(E a,E b,E c){

        // if a>b, then goes to check if a>c, else goes to check if b>c
        return (a.compareTo(b) > 0) 
                ? ((a.compareTo(c) > 0) ? a:c) 
                :((b.compareTo(c) > 0) ? b:c);
    }
    
    public static void main(String[] args) {
        
        //Generate 3 random numbers
        java.util.Random r = new java.util.Random();
        int a = r.nextInt(50);
        int b = r.nextInt(50);
        int c = r.nextInt(50);
        
        //Displaying the maximum of the integer and the String
        System.out.println(a + " " + b + " " + c);
        System.out.print("Maximum is ");
        System.out.println(maximum(a,b,c));
        System.out.println(maximum("Ali","Hybrid","Weird"));
    }
}
