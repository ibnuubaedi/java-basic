package Section03.Content;

public class CashRegisterTester {

   public static void main(String[] args) {

       CashRegister nurInayah = new CashRegister(10);
       nurInayah.recordPurchase(10000.0);
       nurInayah.recordPurchase(20000.0);
       nurInayah.recordPurchase(10000.0);
       nurInayah.printReceipt();
       System.out.println("Total Item : " + nurInayah.getItemCount());
       nurInayah.receivedPayment(50000.0);
       nurInayah.recordTaxablePurchase();
       System.out.println(nurInayah.giveChange());

       nurInayah.recordPurchase(70000.0);
       nurInayah.printReceipt();
       System.out.println("Total Item: " + nurInayah.getItemCount());
       nurInayah.receivedPayment(100000.0);
       nurInayah.recordTaxablePurchase();
       System.out.println(nurInayah.giveChange());

       nurInayah.salesCount();
       nurInayah.salesTotal();
       System.out.println("Total Tax : " + nurInayah.getTotalTax());
    }

}
