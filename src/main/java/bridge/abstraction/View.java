package bridge.abstraction;

import bridge.implementor.Resource;

// abstraction
public abstract class View {
  protected Resource resource;

  View(Resource resource) {
    this.resource = resource;
  }

  public abstract String show();
}
