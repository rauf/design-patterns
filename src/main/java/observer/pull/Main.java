package observer.pull;

import observer.pull.observers.PullObserver;
import observer.pull.observers.PullObserverA;
import observer.pull.observers.PullObserverB;
import observer.pull.subject.PullSubject;

public class Main {

  public static void main(String[] args) {
    PullSubject subject = new PullSubject();
    PullObserver observerA = new PullObserverA(subject);
    PullObserver observerB = new PullObserverB(subject);

    subject.setX(30);

    subject.removeObserver(observerA);
    subject.setY(40);
  }
}
