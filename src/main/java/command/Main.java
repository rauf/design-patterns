package command;

import command.commands.FanOnCommand;
import command.commands.LightsDimDownCommand;
import command.commands.LightsDimUpCommand;
import command.commands.LightsOffCommand;
import command.commands.LightsOnCommand;
import command.commands.SwitchOffMultipleLightsCommand;
import command.invoker.Remote;
import command.receiver.Fan;
import command.receiver.Light;

public class Main {

  public static void main(String[] args) {
    Light light = new Light(1);
    Remote remote = new Remote(new LightsDimUpCommand(light),
        new LightsDimDownCommand(light),
        new LightsOffCommand(light),
        new LightsOnCommand(light));

    remote.pressDown();
    remote.pressOn();

    Fan fan = new Fan(2);

    Remote universalRemote = new Remote(new LightsDimUpCommand(light),
        new LightsDimDownCommand(light),
        new SwitchOffMultipleLightsCommand(),
        new FanOnCommand(fan));

    universalRemote.pressOn();
    universalRemote.pressUp();
    universalRemote.pressOff();
  }
}
