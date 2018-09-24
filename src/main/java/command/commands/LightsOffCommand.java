package command.commands;

import command.receiver.Light;

public class LightsOffCommand implements Command {

  private Light light;

  public LightsOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    this.light.lightsOff();
  }

  public void unExecute() {
    this.light.lightsOn();
  }
}
