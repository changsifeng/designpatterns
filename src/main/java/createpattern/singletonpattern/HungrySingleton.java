package createpattern.singletonpattern;

/**
 * 饿汉单例
 * @author GYF
 * @date 11/23/20
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static synchronized HungrySingleton getInstance() {
        return instance;
    }
}