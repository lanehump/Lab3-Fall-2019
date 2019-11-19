
/**
 * Will test the methods written in class BankAccount.
 * 
 * @author (Lane Humphreys) 
 * @version (09/07/19)
 */
public class BankAccountTester
{
    /**
     * Tests the methods of the bankAccount class
     */
    public static void main(String[]args )
    {
        BankAccount lanesChecking = new BankAccount();
        lanesChecking.deposit(2000);
        lanesChecking.withdraw(500);
        System.out.println(lanesChecking.getBalance());
        BankAccount one = new BankAccount();
        /**
         * Here I created a new bank accoutn object with name one
         * I also printed the initial balance after i deposited 2500 into the account
         * I used my addInterest method so i could calulate the balance after 5% of interest is added
         * I printed the new balance
         * I printed the expected balance
         */
        one.deposit(2500);
        System.out.println("Initial Balance of bank account one: " + one.getBalance());
        one.addInterest(0.05);
        System.out.println("The Balance of Bank Account one after interest is " + one.getBalance());
        System.out.println("The expected balance is 2,625");
        /**
         * I created a new bank account with name two
         * I deposited 10000 into the account
         * I printed the initial balance
         * i then added the interest 
         * Then printed the new balance with the interest and the expected amount
         */
        
        BankAccount two = new BankAccount();
        two.deposit(10000);
        System.out.println("The initial Balance of account two is: " + two.getBalance());
        two.addInterest(0.05);
        System.out.println("The Balance after interest of bank account two is: " + two.getBalance());
        System.out.println("The expected balance was 10,500");
        
        BankAccount three = new BankAccount();
        three.deposit(1000000);
        System.out.println("The initial Balance of bank account three is: " + three.getBalance());
        three.addInterest(0.05);
        System.out.println("The balance of bank account three after interest is: " + three.getBalance());
       System.out.println("The expected Balance was: 1,050,000"); 
    }



}
