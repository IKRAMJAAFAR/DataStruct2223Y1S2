/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

import java.util.*;

/**
 *
 * @author weare
 */
public class Account1 extends Q3.Account{
    private final String name;
    private final ArrayList<Transition> transitions;
    
    public Account1(int id, double balance,String name){
        super(id,balance);
        this.name = name;
        transitions = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    public void getTransitions(){
        for(int counter = 0;counter < transitions.size();counter++){
            System.out.println("(" + (counter + 1) + ")");
            Transition trans = transitions.get(counter);
            System.out.println(trans.getDate());
            System.out.print("Type: ");
            switch(trans.getType()){
                case 'W' -> System.out.println("Withdraw");
                case 'D' -> System.out.println("Deposit");
            }
            System.out.println("Amount: " + trans.getAmount());
            System.out.println("New balance: " + trans.getBalance());
            System.out.println("Descriptions: " + trans.getDesc());
            System.out.println("");
        }
    }
    
    public void withdraw(double amount, String desc){
        if(amount <= super.getBalance()){
            super.setBalance(super.getBalance() - amount);
            transitions.add(new Transition('W',amount,super.getBalance(),desc));
        }
        else
            System.out.println("Insufficient amount!");
    }
    
    public void deposit(double amount, String desc){
        super.setBalance(super.getBalance() + amount);
        transitions.add(new Transition('D',amount,super.getBalance(),desc));
    }
    

    private static class Transition {
        private Date date;
        private char type;
        private double amount;
        private double balance;
        private String description;

        public Transition(char type, double amount, double balance, String desc) {
            this.type = type;
            this.amount = amount;
            this.balance = balance;
            description = desc;
            long sec = System.currentTimeMillis();
            date = new Date(sec);
        }
        
        public Date getDate(){
            return date;
        }
        public void setDate(Date date){
            this.date = date;
        }
        public char getType(){
            return type;
        }
        public void setType(char type){
            this.type = type;
        }
        public double getAmount(){
            return amount;
        }
        public void setAmount(double amount){
            this.amount = amount;
        }
        public double getBalance(){
            return balance;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public String getDesc(){
            return description;
        }
        public void setDesc(String desc){
            description = desc;
        }
    }
    
}
