package observer.pull.observers;

import lombok.Getter;
import observer.pull.subject.PullObservable;
import observer.pull.subject.PullSubject;

public class PullObserverA implements PullObserver {

  @Getter
  private int            x;
  private PullObservable subject;

  public PullObserverA(PullObservable subject) {
    this.subject = subject;
    this.subject.addObserver(this);
  }

  @Override
  public void update(PullObservable subject) {
    this.x = ((PullSubject) subject).getData().getX();
    System.out.println("X in PullObserver A " + getX());
  }
}
