package cs.oop.abstraction;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Animal[] animals = { new Cat(), new Dog() };
    for (Animal animal : animals) {
      animal.metod1("S");
    }

    int a = new Cat().getSum(1, 2, 3, 34, 544, 45, 54);

  }
}