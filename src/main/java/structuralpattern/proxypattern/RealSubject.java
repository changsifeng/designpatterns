package structuralpattern.proxypattern;

/**
 * 真实subject
 * @author GYF
 * @date 2020/11/23
 */
public class RealSubject implements Subject{
    @Override
    public void Request() {
        System.out.println("访问真实主题方法……");
    }
}
