package factory.creator;

import factory.product.Animal;
import factory.product.Cat;
import factory.product.Dog;
import java.util.Random;

public class RandomAnimalFarm extends AnimalFarm {

  private Random random = new Random();

  @Override
  protected Animal factory() {
    switch (random.nextInt(2)) {
      case 0: return new Cat();
      case 1: return new Dog();
      default: return null;
    }

  }
}
