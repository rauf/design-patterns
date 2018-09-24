package factory.product;

public class Dog implements Animal {

  @Override
  public void makeSound() {
    System.out.println("Dog Barked");
  }

  @Override
  public void die() {
    System.out.println("Dog died");
  }

  @Override
  public void walk() {
    System.out.println("Dog walk");
  }
}
