/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author weare
 */
public class FindMax {


    static class Circle implements Comparable<Circle>{
    
        //Instance variables with default visiblity
        final double radius;
    
        //Constructor
        public Circle(double radius){
            this.radius = radius;
        }
    
        @Override
        public int compareTo(Circle c){
            if(this.radius > c.radius)
                return 1;
            else if(this.radius < c.radius)
                return -1;
            else
                return 0;
        }
    
}
    
    public static void main(String[] args) {
        //Initialize objects
        Integer[] a = {1,2,3};
        String[] b = {"red","green","blue"};
        Circle[] c = {new Circle(5.0),new Circle(2.9), new Circle(5.9)};
        
        //Displaying max in each object
        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println("Circle with radius of " + max(c).radius);
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        //Initialize the max
        E max = list[0];
        
        //Loop for get the max
        for(E object:list)
            max = max.compareTo(object) < 0 ? object:max;
        
        return max;
    }
}
