package template;

public class Main {

  public static void main(String[] args) {
    Record userRecord = new UserRecord();
    Record addressRecord = new AddressRecord();
    userRecord.save();
    addressRecord.save();
    addressRecord.afterSave();
  }
}
