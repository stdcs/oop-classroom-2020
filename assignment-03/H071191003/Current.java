public class Current extends Account {
    public Current(double balance) {
        super.balance = balance;
    }
    @Override
    public void Withdraw(double amount) {
        super.Withdraw(amount);
    }
    @Override
    public void Deposit(double amount) {
        super.Deposit(amount);
    }
    @Override
    public void printBalance() {
        System.out.print("Balance in your current account: ");
        super.printBalance();
    }
}