package observer.pull.subject;

import observer.pull.observers.PullObserver;

public interface PullObservable {

  void addObserver(PullObserver observer);
  void removeObserver(PullObserver observer);
  void notifyObservers();
}
