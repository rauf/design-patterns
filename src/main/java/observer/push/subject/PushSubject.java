package observer.push.subject;

import java.util.ArrayList;
import java.util.List;
import observer.push.observers.PushObserver;

public class PushSubject implements PushObservable {

  private List<PushObserver> observers;
  private int x;
  private int y;

  public PushSubject() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void addObserver(PushObserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(PushObserver observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    this.observers.forEach(observer -> observer.update(x, y));
  }

  public void setX(int x) {
    this.x = x;
    notifyObservers();
  }

  public void setY(int y) {
    this.y = y;
    notifyObservers();
  }
}
