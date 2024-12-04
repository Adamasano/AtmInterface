package atm;

import java.util.Scanner;

public class WithdrawMoney 
{
    public static void withdraw(User user, Scanner scanner) 
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > user.getAccountBalance()) 
        {
            System.out.println("Insufficient balance!");
        } else 
        {
            user.setAccountBalance(user.getAccountBalance() - amount);
            user.addTransaction("Withdrawn: $" + amount);
            System.out.println("Withdrawal successful! New balance: $" + user.getAccountBalance());
        }
    }
}
