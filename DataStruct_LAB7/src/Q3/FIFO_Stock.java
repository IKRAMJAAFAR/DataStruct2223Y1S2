/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import Q1.MyQueue;
import java.util.*;
/**
 *
 * @author weare
 */
public class FIFO_Stock {
    static MyQueue<Integer> shareQ = new MyQueue<>();
    static MyQueue<Integer> priceQ = new MyQueue<>();
    static Scanner s = new Scanner(System.in);
    static Integer totalCap = 0;
    
    public static void main(String[] args) {
        System.out.println("Instruction!");
        System.out.println("Add to your queue sharing and pricing.");
        System.out.println("Make in this format");
        System.out.println("\"(Buy / Sell) x share(s) at $y each\"");
        System.out.println("OR");
        System.out.println("Anything else to exit the program");
        System.out.println("");
        int day = 1;
        while(true){
            System.out.println("Day " + day);
            scan();
            day++;
            System.out.println("");
        }
        
    }
    
    public static void scan() {
        System.out.print("Query: ");
        String temp = s.nextLine();
        String[] result = temp.split(" ");
        switch(result[0]){
            case "Buy","buy","Sell","sell" -> {
                Integer share = Integer.parseInt(result[1]);
                Integer price = Integer.parseInt(result[4].substring(1));
                if(result[0].equalsIgnoreCase("buy"))
                    buy(share,price);
                else
                    sell(share,price);
                
            }
            default -> exit();
        }
        
    }
    public static void buy(Integer share, Integer price){
        System.out.print("Buying shares");
        shareQ.enqueue(share);
        priceQ.enqueue(price);
        waitInsert();
        display();
    }
    public static void sell(Integer share, Integer price){
        System.out.print("Selling shares");
        waitInsert();
        while(share > 0){
            share = FIFO(share,price);
        }
        display();
    }
    
    public static Integer FIFO(Integer share, Integer price){
        if(shareQ.isEmpty()){
            System.out.println("No shares to sell!");
            return 0;
        }
        else{
//            boolean[] status = new boolean[shareQ.getSize()];
//            Integer[] temp = new Integer[shareQ.getSize()];
//            Arrays.fill(status, true);
//            MyQueue<Integer> subtract = new MyQueue<>();
//            for(int i = 0;i < shareQ.getSize();i++){
//                if(share >= shareQ.getElement(i)){
//                    temp[i] = 0;
//                    subtract.enqueue(shareQ.getElement(i));
//                    share -= shareQ.getElement(i);
//                }
//                else{
//                    temp[i] = shareQ.getElement(i) - share;
//                    subtract.enqueue(share);
//                    share = 0;
//                    if(i != 0)
//                        status[i] = false;
//                }
//            }
//            MyQueue<Integer> resultShare = new MyQueue<>();
//            for(int i = 0;i < shareQ.getSize();i++){
//                resultShare.enqueue(shareQ.getElement(i) - subtract.getElement(i));
//            }
//            //get the total capital
//            for(int i = 0;i < shareQ.getSize();i++){
//                totalCap += resultShare.getElement(i) * (price - priceQ.getElement(i));
//                if(status[i])
//                    System.out.println("Total Capital Gain/Loss: $" + totalCap);
//            }
//            //get the new share queue and pricing
//            shareQ = new MyQueue<>(temp);
//            while(shareQ.peek() == null){
//                shareQ.dequeue();
//                priceQ.dequeue();
//            }

            if(share >= shareQ.peek()){
                share -= shareQ.peek();
                totalCap += shareQ.dequeue() * (price - priceQ.dequeue());
            }
            else{
                totalCap += share * (price - priceQ.peek());
                //Changing values in Share Queue
                Integer[] temp = new Integer[shareQ.getSize()];
                for(int i=0;i < shareQ.getSize();i++){
                    temp[i] = switch(i){
                        case 0 -> shareQ.peek() - share;
                        default -> shareQ.getElement(i);
                    };
                }
                share = 0;
                shareQ = new MyQueue<>(temp);
            }
            System.out.println("Total Capital Gain/Loss: $" + totalCap);
            return share;
        }
        
    }
    
    
    public static void waitInsert(){
        try{
            for(int i = 1;i <= 5;i++){
                System.out.print(".");
                Thread.sleep((long) (0.5 * Math.pow(10, 3)));
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("");
        
        
    }
    public static void display(){
        System.out.println("Share Queue: " + shareQ.toString());
        System.out.println("Price Queue: " + priceQ.toString());
    }
    
    public static void exit(){
        System.out.println("Final Capital Gain/Loss: $" + totalCap);
        System.exit(0);
    }
    
}
