public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    @Override
    public void withdrawal(double amount) {
        if (getBalance() < amount) {
            super.withdrawal(amount + 30.0);  // Charge the overdraft fee
            processWithdrawal();
        } else {
            super.withdrawal(amount);
        }
    }

    public void processWithdrawal() {
        System.out.println("An overdraft fee of $30 has been charged to your account.");
    }

    public void displayAccount() {
        accountSummary(); // Call the superclass method
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Getter and setter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}