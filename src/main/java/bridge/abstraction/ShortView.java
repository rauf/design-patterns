package bridge.abstraction;

import bridge.implementor.Resource;

public class ShortView extends View {

  public ShortView(Resource resource) {
    super(resource);
  }

  @Override
  public String show() {
    return String.format("%s | %s", resource.title(), resource.summary());
  }
}
