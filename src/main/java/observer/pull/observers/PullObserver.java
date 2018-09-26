package observer.pull.observers;

import observer.pull.subject.PullObservable;

public interface PullObserver {

  void update(PullObservable subject);
}
