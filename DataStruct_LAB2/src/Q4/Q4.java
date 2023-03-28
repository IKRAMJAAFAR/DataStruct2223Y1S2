/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author weare
 */
public class Q4{
    public static <E extends Comparable<E>> String minmax(E[] array){
        //Initialize the min and max
        E min = array[0];
        E max = array[0];
        
        //Goes through the arrays
        for(E arr:array){
            
            //Check if min > element and max < element to assign it accordingly
            min = min.compareTo(arr) > 0 ? arr:min;
            max = max.compareTo(arr) < 0 ? arr:max;
            
        }
        
        return "Min = " + min + " Max = " + max;
    }
    public static void main(String[] args) {
        //Initialize objects
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        //Displaying the min and max of each array
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
