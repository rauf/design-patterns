package observer.pull.observers;

import lombok.Getter;
import observer.pull.subject.PullObservable;
import observer.pull.subject.PullSubject;

public class PullObserverB implements PullObserver {

  @Getter
  private int            y;
  private PullObservable subject;

  public PullObserverB(PullObservable subject) {
    this.subject = subject;
    this.subject.addObserver(this);
  }

  @Override
  public void update(PullObservable subject) {
    this.y = ((PullSubject) subject).getData().getY();
    System.out.println("Y in PullObserver B " + getY());
  }
}
