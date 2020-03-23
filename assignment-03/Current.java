class Current extends Account {

    public Current(double balance) {
        super(balance);
    }

    public void Withdraw(double amount) {
        balance -= amount;
    }

    public void Deposit(double amount) {
        balance += amount;
    }

    public void printBalance() {
        System.out.println("Balance in your current account: " + balance);
    }
}