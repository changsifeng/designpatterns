package structuralpattern.adapterpattern;

/**
 * 适配者接口
 * @author Gyf
 * @date 2020/11/24
 */
public class Adaptee {
    public void specificRequest(){
        System.out.println("适配者中的业务代码被调用");
    }
}
