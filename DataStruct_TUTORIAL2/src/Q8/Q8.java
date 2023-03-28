/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q8;

/**
 *
 * @author weare
 */
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        numOfCars.add(2);
        milesPerHour.add(5.5);
        display(numOfCars);
        display(milesPerHour);
    }
    
    public static void display(ArrayList<?> item){
        System.out.println(item.toString());
    }
}
