package command.commands;

import command.receiver.Light;

public class LightsDimUpCommand implements Command {

  private Light light;

  public LightsDimUpCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    this.light.dimUp();
  }

  public void unExecute() {
    this.light.dimDown();
  }
}
