package atm;

import java.util.ArrayList;

public class User 
{
    private String userID = "adama55";
    private String userPIN = "1234";
    private double accountBalance = 10000.0;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    public boolean validateLogin(String enteredID, String enteredPIN) 
    {
        return userID.equals(enteredID) && userPIN.equals(enteredPIN);
    }

    public double getAccountBalance() 
    {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) 
    {
        this.accountBalance = accountBalance;
    }

    public ArrayList<String> getTransactionHistory() 
    {
        return transactionHistory;
    }

    public void addTransaction(String transaction) 
    {
        transactionHistory.add(transaction);
    }
}
