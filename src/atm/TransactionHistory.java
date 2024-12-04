package atm;

public class TransactionHistory 
{
    public static void viewTransactionHistory(User user) 
    {
        if (user.getTransactionHistory().isEmpty()) 
        {
            System.out.println("No transactions yet.");
        } else 
        {
            System.out.println("Transaction History:");
            for (String transaction : user.getTransactionHistory()) 
            {
                System.out.println(transaction);
            }
        }
    }
}
