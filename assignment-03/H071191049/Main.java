public class Main {
    public static void main(String args[]) {
      Account accountSave = new Savings(50000);
      accountSave.Deposit(1000);
      accountSave.printBalance();
      accountSave.Withdraw(3000);
      accountSave.printBalance();
      System.out.println();
  
      Account accountCurrent = new Current(50000);
      accountCurrent.Deposit(1000);
      accountCurrent.printBalance();
      accountCurrent.Withdraw(3000);
      accountCurrent.printBalance();  
    }
    
  }