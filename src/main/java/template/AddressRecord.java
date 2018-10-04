package template;

public class AddressRecord extends Record {

  @Override
  protected void beforeSave() {
    System.out.println("Address: Before Save");
  }

  @Override
  protected void afterSave() {
    System.out.println("Address: After Save");
  }

  @Override
  protected boolean validate() {
    return false;
  }
}
