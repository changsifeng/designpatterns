package commandpattern;

/**
 * @author GYF
 * @date 11/23/20
 */
public class CommandPattern {
    public static void main(String[] args) {
        ConcreteCommand concreteCommand = new ConcreteCommand();
        Invoker invoker = new Invoker(concreteCommand);
        System.out.println("客户访问调用者的call()方法...");
        invoker.call();
    }
}
