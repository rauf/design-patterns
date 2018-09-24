package command.commands;

import command.receiver.Fan;

public class FanOnCommand implements Command {

  private Fan fan;

  public FanOnCommand(Fan fan) {
    this.fan = fan;
  }

  public void execute() {
    this.fan.fanOn();
  }

  public void unExecute() {
    this.fan.fanOff();
  }
}
