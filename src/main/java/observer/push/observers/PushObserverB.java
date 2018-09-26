package observer.push.observers;

import lombok.Getter;
import observer.push.subject.PushObservable;

public class PushObserverB implements PushObserver {

  @Getter
  private int y;
  private PushObservable observable;

  public PushObserverB(PushObservable observable) {
    this.observable = observable;
    this.observable.addObserver(this);
  }

  @Override
  public void update(int x, int y) {
    this.y = y;
    System.out.println("Y in PushObserver A " + getY());
  }
}
