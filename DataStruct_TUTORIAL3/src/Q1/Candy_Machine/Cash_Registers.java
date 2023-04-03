/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1.Candy_Machine;

/**
 *
 * @author weare
 */
import java.util.*;

final class Cash_Registers implements Slot {
    //The availables notes and cent
    private ArrayList<Double> holdAll = new ArrayList<>();
    private static Double total = 10000.00;
    public static Double hold = 0.00;
    
    public Cash_Registers(){
    }
    
    public void insert(Double cash){
        holdAll.add(cash);
        hold += cash;
    }
    
    public void add(){
        holdAll.forEach(index -> {
            total += index;
        });
        subtract();
        hold = 0.00;
    }
    
    public void change(Double cash){
        double out = (total >= cash) ? cash:total;
        if(total >= cash)
            total -= cash;
        else
            total -= total;
        System.out.printf("Please collect the change: RM%.2f below.\n", out);
    }
    
    
    
    @Override
    public void subtract() {
        holdAll.removeAll(holdAll);
    }
    
    
}
