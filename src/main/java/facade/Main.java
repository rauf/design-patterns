package facade;

public class Main {

  public static void main(String[] args) {
    SystemFacade facade = new SystemFacade();
    System.out.println(facade.operation1());
    System.out.println(facade.operation2());
  }
}
