package factory.product;

public class Cat implements Animal {

  @Override
  public void makeSound() {
    System.out.println("Cat Meow");
  }

  @Override
  public void die() {
    System.out.println("Cat died");
  }

  @Override
  public void walk() {
    System.out.println("Cat walk");
  }
}
