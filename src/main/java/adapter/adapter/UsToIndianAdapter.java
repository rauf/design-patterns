package adapter.adapter;

import adapter.adaptee.UsCharger;
import adapter.target.IndianCharger;

//converter
public class UsToIndianAdapter implements IndianCharger {

  private UsCharger usCharger;

  public UsToIndianAdapter(UsCharger usCharger) {
    this.usCharger = usCharger;
  }

  @Override
  public void chargeIndianPhone(int volts) {
    System.out.println("Getting voltage " + volts);
    // conversion of voltages, etc.
    usCharger.chargeUsPhone(110);
  }
}
