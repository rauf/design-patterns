package command.receiver;

// Receiver .. may be independent and not share a common interface
public class Light {

  private int lightNumber;

  public Light(int lightNumber) {
    this.lightNumber = lightNumber;
  }

  public void lightsOn() {
    System.out.println("Lights On!! " + lightNumber);
  }

  public void lightsOff() {
    System.out.println("Lights Off!! " + lightNumber);
  }

  public void dimUp() {
    System.out.println("Lights Dim Up!! " + lightNumber);
  }

  public void dimDown() {
    System.out.println("Lights Dim Down!! " + lightNumber);
  }
}
