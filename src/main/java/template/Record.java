package template;

public abstract class Record {

  // template method
  public final void save() {
    if (!validate()) {
      System.out.println("Validation failed");
      return;
    }
    beforeSave();
    System.out.println("Query run");
    afterSave();
  }

  protected abstract void beforeSave();

  protected abstract void afterSave();

  protected abstract boolean validate();
}
