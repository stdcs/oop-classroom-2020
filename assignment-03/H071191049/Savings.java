public class Savings extends Account {
    
    double interestRate = 0.8;
    public Savings(int balance) {
      super(balance);
    }
    public void Deposit(double amount) {
      balance += amount + (amount * interestRate);
    }
    public void Withdraw(double amount) {
      balance -= amount + (amount * interestRate);
    }
    public void printBalance() {
      System.out.println("Balance in your saving account: " + balance);
    }
    
  }
  