/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;


import java.util.*;

/**
 *
 * @author weare
 */
public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        long sec = System.currentTimeMillis();
        dateCreated = new Date(sec);
    }
    
    public Account(){
        id = 0;
        annualInterestRate = 0;
        balance = 0;
        long sec = System.currentTimeMillis();
        dateCreated = new Date(sec);
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate/100.0;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12.0;
    }
    public double getMonthlyInterest(){
        return getMonthlyInterestRate() * balance;
    }
    
    public void withdraw(double amount){
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient amount!");
    }
    public void deposit(double amount){
        balance += amount;
    }
    
}
