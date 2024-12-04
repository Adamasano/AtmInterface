package atm;

import java.util.Scanner;

public class ATMInterface 
{
    private User user;

    public ATMInterface() 
    {
        user = new User();
    }

    public void startATM() 
    {
        Scanner scanner = new Scanner(System.in);

        // Login
        System.out.print("Enter User ID: ");
        String enteredID = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String enteredPIN = scanner.nextLine();

        if (!user.validateLogin(enteredID, enteredPIN)) 
        {
            System.out.println("Invalid User ID or PIN. Exiting...");
            return;
        }
        
        System.out.println("\nLogin Successful!");

        // Menu
        boolean quit = false;
        while (!quit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. View Transaction History");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    TransactionHistory.viewTransactionHistory(user);
                    break;
                case 2:
                    WithdrawMoney.withdraw(user, scanner);
                    break;
                case 3:
                    DepositMoney.deposit(user, scanner);
                    break;
                case 4:
                    TransferMoney.transfer(user, scanner);
                    break;
                case 5:
                    quit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) 
    {
        ATMInterface atmInterface = new ATMInterface();
        atmInterface.startATM();
    }
}
