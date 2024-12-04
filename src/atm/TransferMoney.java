package atm;

import java.util.Scanner;

public class TransferMoney 
{
    public static void transfer(User user, Scanner scanner) 
    {
        System.out.print("Enter recipient's User ID: ");
        scanner.nextLine(); // Consume the newline
        String recipientID = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > user.getAccountBalance()) 
        {
            System.out.println("Insufficient balance!");
        } else 
        {
            user.setAccountBalance(user.getAccountBalance() - amount);
            user.addTransaction("Transferred: $" + amount + " to " + recipientID);
            System.out.println("Transfer successful! New balance: $" + user.getAccountBalance());
        }
    }
}
