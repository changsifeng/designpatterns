package structuralpattern.adapterpattern;

/**
 * 类适配器类
 * @author Gyf
 * @date 2020/11/24
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
