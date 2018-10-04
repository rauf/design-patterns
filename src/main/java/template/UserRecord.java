package template;

public class UserRecord extends Record {

  @Override
  protected void beforeSave() {
    System.out.println("User: Before Save");
  }

  @Override
  protected void afterSave() {
    System.out.println("User: After Save");
  }

  @Override
  protected boolean validate() {
    return true;
  }
}
