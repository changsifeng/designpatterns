package createpattern.singletonpattern;

/**
 * 懒汉单例
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getSingleton()
        {
            //getInstance 方法前加同步
            if(instance==null)
            {
                instance=new LazySingleton();
            }
            return instance;
        }

}