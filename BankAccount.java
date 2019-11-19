
/**
 * Provides a set of written methods.
 * 
 * @author (Lane Humphreys) 
 * @version (09/17/19)
 */
public class BankAccount
{
    private double balance;
    //Cosntructs a bank account with a zero balance
    public BankAccount()
    {
        balance = 0;
    }
    /**Constructs a bank accoubt with a given balance
     @param initialBalance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance; 
    }
    /**
       Deposits money into the bank account.
       @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    /**
     * Withdraws money from the bank account
     * @param amount to withdraw
     */ 
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    /**
     * Gets current balance of the account
     *  @return the current balance
     */ 
    public double getBalance()
    {
        return balance;
    }
    /**
     * Gives an interest rate
     * @param rate the rate of interest
     * set rate to .05 so it is 5% interest
     */
    public void addInterest(double rate)
    {
        balance = balance + (balance * rate);

    }

}
