package responsibilitychainpattern;

/**
 * 处理器
 * @author GYF
 * @date 11/23/20
 */
abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}