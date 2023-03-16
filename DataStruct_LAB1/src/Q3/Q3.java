/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.text.SimpleDateFormat;

/**
 *
 * @author weare
 */
public class Q3 {
    public static void main(String[] args) {
        Account account = new Account(1122,20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2_500);
        account.deposit(3_000);
        System.out.println("Displaying");
        System.out.printf("Balance: $%.2f\n",account.getBalance());
        System.out.printf("Montly Interest: $%.2f\n", account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
