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

//The application program
public class Candy_Machine {
    public static void main(String[] args) {
        Dispensers[] dispensers =
        {
            new Dispensers("Cookies",4),
            new Dispensers("Candies",7),
            new Dispensers("Gum",8),
            new Dispensers("Chips",3)
        }; 
        Cash_Registers reg = new Cash_Registers();
        displayAction();
        
        boolean displayDis = true;
        
        Scanner s = new Scanner(System.in);
        for(;;){
            int count = 0;
            
            displayDispensers(displayDis,1,dispensers);
            
            System.out.printf("""
                              Money added: RM %.2f
                              """,Cash_Registers.hold);
            System.out.println("");
            System.out.print("Action: ");
            
            
            output(s.nextInt(),s,count,displayDis,reg,dispensers);
            
            
        }
    }
    
    
    
    public static void displayAction(){
        System.out.println("Action");
        System.out.println("1 - Add money");
        System.out.println("2 - Purchase item");
        System.out.println("");
    }
    
    public static void displayDispensers(boolean status, int count, Dispensers[] dispensers){
        if(status){
            System.out.println("Dispensers list:");
                for(Dispensers dis: dispensers){
                    if(dis.getQuantity() > 0)
                        System.out.printf(count + " - " + dis.getProduct() 
                                + " RM " 
                                + "%.2f\n",dis.getPrice() );
                    count++;
                }
        }
    }
    
    public static void output(int a,Scanner s,int count,boolean displayDis, Cash_Registers reg, Dispensers[] dispensers){
        switch(a){
                case 1 -> {
                    displayDis = false;
                    Double[] input = {0.10,0.20,0.50,1.00};
                    for(count = 0;count < input.length;count++){
                        System.out.printf((count + 1) + " - RM" + "%.2f\n",input[count]);
                    }
                    System.out.print("Money: ");
                    count = s.nextInt();
                    if(count >= 1 && count <= 4){
                        if(Cash_Registers.hold + input[count - 1] <= 5.00)
                            reg.insert(input[count - 1]);
                        else
                            System.out.printf("RM %.2f is not accepted due to maximum capacity of money can hold (RM5.00)",input[count - 1]);
                    }
                    else
                        System.out.println("Invalid input");
                }
                case 2 -> {
                    System.out.print("Selection: ");
                    count = s.nextInt();
                    if(count >= 1 && count <= 4){
                        if(Cash_Registers.hold >= dispensers[count - 1].getPrice()){
                            displayDis = true;
                            dispensers[count - 1].subtract();
                            System.out.println("Your money has been taken.");
                            Double change = Cash_Registers.hold - dispensers[count - 1].getPrice();
                            System.out.printf("Change: RM %.2f\n",change );
                            reg.add();
                            reg.change(change);
                            System.out.println("Please collect the " + dispensers[count - 1].getProduct() + " below.");
                        }
                        else{
                            System.out.println("Insufficient money! Add some more!");
                        }
                    }
                }
                default -> {
                    System.out.println("Invalid Input. Try again!");
                    displayDis = false;
                }
            }
    }
}
