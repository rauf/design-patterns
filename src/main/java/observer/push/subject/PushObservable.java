package observer.push.subject;

import observer.push.observers.PushObserver;

public interface PushObservable {
  void addObserver(PushObserver observer);
  void removeObserver(PushObserver observer);
  void notifyObservers();
}
