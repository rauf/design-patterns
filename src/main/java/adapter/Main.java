package adapter;

import adapter.adaptee.UsChargerImpl;
import adapter.adapter.UsToIndianAdapter;
import adapter.client.IndianSocket;

// change the interface, not the implementation
public class Main {

  public static void main(String[] args) {
    IndianSocket indianSocket = new IndianSocket(new UsToIndianAdapter(new UsChargerImpl()));
    indianSocket.charge();
  }
}
