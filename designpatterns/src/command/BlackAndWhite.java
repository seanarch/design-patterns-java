package command;

import command.fx.Command;

public class BlackAndWhite implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
