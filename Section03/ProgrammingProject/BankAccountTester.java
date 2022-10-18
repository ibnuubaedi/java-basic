package Section03.ProgrammingProject;

public class BankAccountTester {

    public static void main(String[] args) {

        BankAccount inayah = new BankAccount(500000.0, 5000.0);
        inayah.withdraw(50000.0);
        inayah.withdraw(50000.0);
        inayah.deposit(100000.0);
        inayah.deposit(100000.0);
        inayah.deposit(100000.0);
        inayah.withdraw(200000.0);
        inayah.deposit(100000.0);
        inayah.deposit(100000.0);
        System.out.println(inayah.getBalance());
        inayah.deductMonthlyCharge(5);
        System.out.println(inayah.getBalance());

    }

}
