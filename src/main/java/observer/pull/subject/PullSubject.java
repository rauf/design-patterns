package observer.pull.subject;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import observer.pull.data.Data;
import observer.pull.observers.PullObserver;

public class PullSubject implements PullObservable {

  private List<PullObserver> observers;

  @Getter
  private Data               data;

  public PullSubject() {
    this.observers = new ArrayList<>();
    this.data = new Data();
  }

  @Override
  public void addObserver(PullObserver observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(PullObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(this));
  }

  public void setX(int x) {
    this.data.setX(x);
    notifyObservers();
  }

  public void setY(int y) {
    this.data.setY(y);
    notifyObservers();
  }
}
