package cs.oop.abstraction;

/**
 * Cat
 */
public class Cat extends Animal {

  public int getSum(int a, int b) {
    return a + b;
  }

  public int getSum(int ... nums) {
    int sum = 0;
    for (int i : nums) {
      sum += i;
    }
    return sum;
  }

  @Override
  public void metod2() {
    // TODO Auto-generated method stub

  }

  @Override
  public void metod3() {
    // TODO Auto-generated method stub

  }

  @Override
  public void metod1(String str) {
    // TODO Auto-generated method stub

  }

  
}