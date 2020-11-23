package commandpattern;

/**
 * 调用类
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
        System.out.println("执行some命令");
    }
}