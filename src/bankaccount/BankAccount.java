/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author USER
 */
public class BankAccount {
    int accountnumber;
    double balance;
    void deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println("Deposited: " +amount);
            
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    
    void withdraw (double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " +amount);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    
    void display()
    {
        System.out.println("Account Number: " +accountnumber);
        System.out.println("Balance: " +balance);
        System.out.println("\n");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountnumber = 123456;
        account1.balance = 1000;
        account1.deposit(1000);
        account1.withdraw(500);
        account1.display();
        
        BankAccount account2 = new BankAccount();
        account2.accountnumber = 654321;
        account2.balance = 2000;
        account2.deposit(1500);
        account2.withdraw(1000);
        account2.display();
        
        // TODO code application logic here
    }
    
}
