package command.receiver;

public class Fan {

  private int fanNumber;

  public Fan(int fanNumber) {
    this.fanNumber = fanNumber;
  }

  public void fanOn() {
    System.out.println("Fan On!! " + fanNumber);
  }

  public void fanOff() {
    System.out.println("Fan Off!! " + fanNumber);
  }

}
