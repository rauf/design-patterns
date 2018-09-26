package observer.push;

import observer.push.observers.PushObserverA;
import observer.push.observers.PushObserverB;
import observer.push.subject.PushSubject;

public class Main {

  public static void main(String[] args) {
    PushSubject subject =  new PushSubject();
    PushObserverA observerA = new PushObserverA(subject);
    PushObserverB observerB = new PushObserverB(subject);

    subject.setX(10);
    subject.removeObserver(observerA);
    subject.setY(20);
  }
}
