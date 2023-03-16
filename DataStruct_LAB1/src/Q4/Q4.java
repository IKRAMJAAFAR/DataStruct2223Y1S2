/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author weare
 */
public class Q4 {
    public static void main(String[] args) {
        Account1 acc;
        acc = new Account1(1122,1000.0,"George");
        acc.setAnnualInterestRate(1.5);
        acc.deposit(30, "Tester");
        acc.deposit(40, "Tester");
        acc.deposit(50, "Tester");
        acc.withdraw(5, "Tester");
        acc.withdraw(4, "Tester");
        acc.withdraw(2, "Tester");
        System.out.println("Name holder: " + acc.getName());
        System.out.println("Interest rate: " + acc.getAnnualInterestRate() + "%");
        System.out.println("Balance: $" + acc.getBalance());
        System.out.println("\nTransitions");
        acc.getTransitions();
    }
}
