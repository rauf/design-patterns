package command.commands;

import command.receiver.Light;

public class LightsDimDownCommand implements Command {

  private Light light;

  public LightsDimDownCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    this.light.dimDown();
  }

  public void unExecute() {
    this.light.dimUp();
  }
}
