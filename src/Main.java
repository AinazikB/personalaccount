public class Main {

    // This is testing main class

    public static void main(String[] args) {
        PersonalAccount a1 = new PersonalAccount(12345, "Ainazik Bakytbek");
        a1.deposit(500);
        a1.deposit(400);
        a1.withdraw(200);
        a1.withdraw(800);

        a1.deposit(1000);
        a1.getAccountNumber();
        a1.printTransactionHistory();

        a1.getBalance();

        a1.getAccountHolder();

        a1.deposit(300);
        a1.withdraw(1000);
        a1.getBalance();

        a1.printTransactionHistory();
    }
}