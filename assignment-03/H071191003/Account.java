public class Account {
    protected double balance;
    public void Withdraw(double amount) {
        balance -= amount;
    }
    public void Deposit(double amount) {
        balance += amount;
    }
    public void printBalance() {
        System.out.println(balance);
    }
}