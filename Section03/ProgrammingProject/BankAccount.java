package Section03.ProgrammingProject;

/**
 A bank account has a balance that can be changed by
 deposits and withdrawals.
 */
public class BankAccount {

    /**
     * Balance of Account Bank.
     */
    private double balance;

    /**
     * Fee for every withdraw and deposit.
     */
    private double fee;

    /**
     * Numbers of transcation in month.
     */
    private double transaction;
    /**
     * Constructor from Bank Account without initial balance and fee.
     * Set balance and fee to 0.
     */

    public BankAccount(){
        this.balance = 0;
        this.fee = 0;
        this.transaction = 0;
    }

    /**
     * Constructor from Bank Account with initial balance.
     * @param initialBalance for Bank Account.
     * @param feeTransaction for every transaction.
     */
    public BankAccount(double initialBalance, double feeTransaction){
        this.balance = initialBalance;
        this.fee = feeTransaction;
        this.transaction = 0;
    }

    /**
     Deposit money to the bank account and charging fee.
     @param amount the amount to deposit.
     */
    public void deposit(double amount){
        this.balance = this.balance + amount;
        this.transaction = this.transaction + 1;
    }

    /**
     Withdraws money from the bank account and charging fee.
     @param amount the amount to withdraw.
     */
    public void withdraw(double amount){
        this.balance = this.balance - amount;
        this.transaction = this.transaction + 1;
    }

    /**
     Gets the current balance of the bank account.
     @return the current balance.
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * Add interest from balance to add balance.
     * @param rate from balance.
     */
    public void addInterest(double rate){
        double interest = this.balance * rate / 100;
        this.balance = balance + interest;
    }

    /**
     * Deducts the monthly charge and resets the transaction count.
     */
    public void deductMonthlyCharge(double freeCharged){
        double transactionFreeCharged = Math.max(this.transaction, freeCharged);
        double transactionAddCharged = transactionFreeCharged - freeCharged;
        double charged = transactionAddCharged * this.fee;
        this.balance = this.balance - charged;
        this.transaction = 0;
    }
}
