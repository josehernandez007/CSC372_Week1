public class BankTest {
    public static void main(String[] args) {
        // Create a checking account
        CheckingAccount myChecking = new CheckingAccount("Jose", "Hernandez", 123456, 0.5);

        // Deposit money
        myChecking.deposit(500);
        myChecking.displayAccount();

        // Withdraw money within the balance
        myChecking.withdrawal(200);
        myChecking.displayAccount();

        // Withdraw money that causes an overdraft
        myChecking.withdrawal(400);
        myChecking.displayAccount();
    }
}