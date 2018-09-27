package adapter.adaptee;

public class UsChargerImpl implements UsCharger {

  @Override
  public void chargeUsPhone(int volts) {
    System.out.println("Charging US phone at volts: " + volts);
  }
}
