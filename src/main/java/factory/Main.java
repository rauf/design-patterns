package factory;

import factory.creator.AnimalFarm;
import factory.creator.RandomAnimalFarm;
import factory.creator.SequenceAnimalFarm;

/*
* Define an interface for creating an object, but let subclasses decide which class to instantiate.
* Factory Method lets a class defer instantiation to subclasses
* */
public class Main {

  public static void main(String[] args) {
    AnimalFarm sequenceFarm = new SequenceAnimalFarm();

    System.out.println("Sequence Farm");
    sequenceFarm.lifeCycle();
    sequenceFarm.lifeCycle();

    AnimalFarm randomFarm = new RandomAnimalFarm();
    System.out.println("\nRandom Farm");

    randomFarm.lifeCycle();
    randomFarm.lifeCycle();

  }
}
