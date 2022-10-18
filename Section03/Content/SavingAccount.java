package Section03.Content;

/**
 A bank account has a balance that can be changed by
 deposits and withdrawals.
 */
public class SavingAccount {
    /**
     * Balance of Account Bank
     */
    private double balance;

    /**
     * Amount interest of Account Bank
     */
    private double interest;

    /**
     * Constructor from Bank Account without initial balance
     * Set balance to 0
     */
    public SavingAccount(){
        this.balance = 0;
        this.interest = 0;
    }

    /**
     * Constructor from Bank Account with initial balance
     * @param initialBalance for Bank Account
     */
    public SavingAccount(double initialBalance, double interest){
        this.balance = initialBalance;
        this.interest = interest;
    }

    /**
     Deposit money to the bank account.
     @param amount the amount to deposit
     */
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    /**
     Withdraws money from the bank account.
     @param amount the amount to withdraw
     */
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    /**
     Gets the current balance of the bank account.
     @return the current balance
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * Add interest from balance to add balance
     */
    public void addInterest(){
        double interest = this.balance * this.interest / 100;
        this.balance = this.balance + interest;
    }

}
