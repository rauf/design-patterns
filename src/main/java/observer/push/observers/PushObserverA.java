package observer.push.observers;

import lombok.Getter;
import observer.push.subject.PushObservable;

public class PushObserverA implements PushObserver{

  @Getter
  private int            x;
  private PushObservable observable;

  public PushObserverA(PushObservable observable) {
    this.observable = observable;
    this.observable.addObserver(this);
  }

  @Override
  public void update(int x, int y) {
    this.x = x;
    System.out.println("X in PushObserver A " + getX());
  }
}
