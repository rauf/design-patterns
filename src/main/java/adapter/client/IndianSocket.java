package adapter.client;

import adapter.target.IndianCharger;

// client
public class IndianSocket {

  private IndianCharger indianCharger;

  public IndianSocket(IndianCharger charger) {
    this.indianCharger = charger;
  }

  public void charge() {
    indianCharger.chargeIndianPhone(220);
  }
}
