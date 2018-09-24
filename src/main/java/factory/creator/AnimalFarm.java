package factory.creator;

import factory.product.Animal;

public abstract class AnimalFarm {

  public void lifeCycle() {
    Animal animal = this.factory();
    animal.makeSound();
    animal.walk();
    animal.die();
  }

  protected abstract Animal factory();
}
