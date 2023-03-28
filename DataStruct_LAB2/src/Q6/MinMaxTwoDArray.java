/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author weare
 */
public class MinMaxTwoDArray {
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        //For every row being repeated
        for(E[] row: list){
            //For every column in a row being repeated
            for(E rowCol: row){
                if(min.compareTo(rowCol) > 0)
                    min = rowCol;
            }
        }
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        //For every row being repeated
        for(E[] row: list){
            //For every column in a row being repeated
            for(E rowCol: row){
                if(max.compareTo(rowCol) < 0)
                    max = rowCol;
            }
        }
        return max;
    }
}
