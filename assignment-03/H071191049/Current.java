public class Current extends Account {
  
    public Current(int balance) { 
      super(balance); 
    }

    public void Deposit(double amount) {
      balance += amount;
    }
  
    public void Withdraw(double amount) {
      balance -= amount;
    }
  
    public void printBalance() {
      System.out.println("Balance in your current account: " + balance);
    }
    
  }