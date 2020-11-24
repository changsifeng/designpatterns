package structuralpattern.adapterpattern;

/**
 * 测试类
 * @author Gyf
 * @date 2020/11/24
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试");
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.request();
    }
}
