/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUTORIAL1;

/**
 *
 * @author weare
 */
interface Account{
    int deposit(int amount);
    boolean withdraw(int amount);
}

abstract class BankAccount implements Account{
    private int balance;
    
    public BankAccount(int balance){
        this.balance = balance;
    }
    
    @Override
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    
    @Override
    public boolean withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }
        else
            return false;
    }
    
    
}

public class Q5 {
    
}
