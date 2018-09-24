package factory.creator;

import factory.product.Animal;
import factory.product.Cat;
import factory.product.Dog;

public class SequenceAnimalFarm extends AnimalFarm {

  private int turn = -1;

  @Override
  protected Animal factory() {
    turn++;
    switch (turn % 2) {
      case 0: return new Cat();
      case 1: return new Dog();
      default: return null;
    }

  }
}
