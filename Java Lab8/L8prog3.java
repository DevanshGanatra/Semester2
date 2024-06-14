/* WAP to create Account class, which is representing a bank account where we can deposit and withdraw money. 
if we want to withdraw money which exceed our bank balance? We will not be allowed, create InSufficientFundException 
to handle above situation and display proper error message
 */

import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String s) {
        super(s);
    }

}

class Account {
    int balance = 1000;

    public void deposit(int addMoney) {
        try{
        if (addMoney < 0) {
            throw new Exception("Cant take Negative inputs incase of Deposit.");
        } else {
            balance += addMoney;
            System.out.println("Current Balance: " + balance);
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }

    public void withdraw(int takeMoney) {
        try {
            if (takeMoney > balance) {
                throw new InSufficientFundException("You Can't Withdraw Money More than Balance.");
            } else {

                balance -= takeMoney;
                System.out.println("Current Balance: " + balance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class L8prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account();
        System.out.println("Your Current Balance is :" + a1.balance);
        System.out.println("Enter money You want to deposit:");
        a1.deposit(sc.nextInt());
        System.out.println("Enter money You want to Withdraw:");
        a1.withdraw(sc.nextInt());

    }
}
