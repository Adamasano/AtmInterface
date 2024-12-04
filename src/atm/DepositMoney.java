package atm;

import java.util.Scanner;

public class DepositMoney 
{
    public static void deposit(User user, Scanner scanner) 
    {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        user.setAccountBalance(user.getAccountBalance() + amount);
        user.addTransaction("Deposited: $" + amount);
        System.out.println("Deposit successful! New balance: $" + user.getAccountBalance());
    }
}
