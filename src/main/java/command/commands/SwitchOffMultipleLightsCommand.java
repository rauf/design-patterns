package command.commands;

import command.receiver.Light;
import java.util.Arrays;
import java.util.List;

public class SwitchOffMultipleLightsCommand implements Command {

  private List<Light> lights;

  public SwitchOffMultipleLightsCommand(List<Light> lights) {
    this.lights = lights;
  }

  public SwitchOffMultipleLightsCommand() {
    this.lights = Arrays.asList(new Light(10), new Light(20), new Light(30));
  }

  public void execute() {
    lights.forEach(Light::lightsOff);
  }

  public void unExecute() {
    lights.forEach(Light::lightsOn);
  }
}
