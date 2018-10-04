package bridge.abstraction;

import bridge.implementor.Resource;

public class LongView extends View {

  public LongView(Resource resource) {
    super(resource);
  }

  @Override
  public String show() {
    return String
        .format("%s | %s\n%s | %s", resource.title(), resource.subtitle(), resource.summary(),
            resource.image());
  }
}
