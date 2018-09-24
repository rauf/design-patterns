package command.invoker;

import command.commands.Command;

// Invoker
public class Remote {

  private Command upCommand;
  private Command downCommand;
  private Command offCommand;
  private Command onCommand;

  public Remote(Command up, Command down, Command off, Command on) {
    this.upCommand = up;
    this.downCommand = down;
    this.offCommand = off;
    this.onCommand = on;
  }

  public void pressUp() {
    this.upCommand.execute();
  }

  public void pressDown() {
    this.downCommand.execute();
  }

  public void pressOff() {
    this.offCommand.execute();
  }

  public void pressOn() {
    this.onCommand.execute();
  }
}
