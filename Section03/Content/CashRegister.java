package Section03.Content;

public class CashRegister {
    /**
     * Purchase data.
     */
    private double purchase;

    /**
     * Total purchase data.
     */
    private double totalPurchase;

    /**
     * Tax of purchase data.
     */
    private double taxPurchase;

    /**
     * Percent tax.
     */
    private double percentTax;

    /**
     * Total tax of purchase data.
     */
    private double totalTaxPurchase;

    /**
     * Payment data.
     */
    private double payment;

    /**
     * Detail purchase data.
     */
    private String detailPurchase;

    /**
     * Count of sales.
     */
    private double salesCount;

    /**
     * Total of sales.
     */
    private double salesTotal;

    /**
     * Construct Cash Register with set all to Zero, except detail purchase to void string.
     */
    public CashRegister(double percentTax){
        this.purchase = 0;
        this.payment = 0;
        this.detailPurchase = "";
        this.salesTotal = 0;
        this.salesCount = 0;
        this.totalPurchase = 0;
        this.taxPurchase = 0;
        this.totalTaxPurchase = 0;
        this.percentTax = percentTax;
    }

    /**
     * Record purchase data.
     * Record detail purchase data.
     * Record total sales.
     * Record count sales.
     * Record purchase item.
     * @param amount of sales.
     */
    public void recordPurchase(double amount){
        this.purchase = this.purchase + amount;

        String amountPurchase = String.valueOf(amount);
        this.detailPurchase = this.detailPurchase.concat(amountPurchase).concat(", ");

        this.salesTotal = this.salesTotal + amount;
        this.salesCount = this.salesCount + 1;

        this.totalPurchase = totalPurchase + 1;
    }

    /**
     * Record Payment Data
     * @param amount of Payment
     */
    public void receivedPayment(double amount){
        this.payment = this.payment + amount;
    }

    /**
     * Calculate Change from payment and purchase
     * Reset purchase & payment to zero
     * @return
     */
    public double giveChange(){
        double change = this.payment - (this.purchase + this.taxPurchase);
        this.payment = 0;
        this.purchase = 0;
        this.detailPurchase = "";
        this.totalPurchase = 0;
        this.taxPurchase = 0;
        return change;
    }

    /**
     * Print detail purchase data
     * Print detail total purchase
     */
    public void printReceipt(){
        System.out.print("Detail Purchase : ");
        System.out.println(this.detailPurchase);
        System.out.print("Total Purchase : ");
        System.out.println(this.purchase);
    }

    /**
     * Print total sales.
     * Reset total sales.
     */
    public void salesTotal(){
        System.out.println("Sales Total : " + this.salesTotal);
        this.salesTotal = 0;
    }

    /**
     * Print count sales.
     * Reset count sales.
     */
    public void salesCount(){
        System.out.println("Sales Count : " + this.salesCount);
        this.salesCount = 0;
    }

    /**
     * Get total purchase.
     * @return total purchase.
     */
    public double getItemCount(){
        return this.totalPurchase;
    }

    /**
     * Record Taxable purchase.
     */
    public void recordTaxablePurchase(){
        double tax = this.purchase * this.percentTax / 100;
        this.taxPurchase = tax;
        this.totalTaxPurchase = totalTaxPurchase + tax;
    }

    /**
     * Get Total Tax.
     */
    public double getTotalTax(){
        return this.totalTaxPurchase;
    }
}
