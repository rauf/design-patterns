package command.commands;

import command.receiver.Fan;

public class FanOffCommand implements Command {
  private Fan fan;

  public FanOffCommand(Fan fan) {
    this.fan = fan;
  }

  public void execute() {
    this.fan.fanOff();
  }

  public void unExecute() {
    this.fan.fanOn();
  }
}
