package commandpattern;

/**
 * 具体命令
 * @author GYF
 * @date 11/23/20
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    //public ConcreteCommand(Receiver receiver) {
    //    this.receiver = receiver;
    //}

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}