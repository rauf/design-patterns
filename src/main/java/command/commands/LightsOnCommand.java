package command.commands;

import command.receiver.Light;

public class LightsOnCommand implements Command {
  private Light light;

  public LightsOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    this.light.lightsOn();
  }

  public void unExecute() {
    this.light.lightsOff();
  }
}
