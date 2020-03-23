class Savings extends Account {

    private double interestRate = 0.8;

    public Savings(double balance) {
        super(balance);
    }

    public void Withdraw(double amount) {
        balance -= ((amount * interestRate) + amount);
    }

    public void Deposit(double amount) {
        balance += ((amount * interestRate) + amount);
    }

    public void printBalance() {
        System.out.println("Balance in your saving account: " + balance);
    }

}