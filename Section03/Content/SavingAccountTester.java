package Section03.Content;

public class SavingAccountTester {

    public static void main(String[] args) {

        SavingAccount inayahSavings = new SavingAccount(1000.00,10.00);
        System.out.println(inayahSavings.getBalance());
        inayahSavings.addInterest();
        System.out.println(inayahSavings.getBalance());

    }

}
