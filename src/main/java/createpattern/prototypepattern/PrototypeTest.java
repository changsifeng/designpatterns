package createpattern.prototypepattern;

/**
 * 原型模式测试类
 * @author GYF
 * @date 2020/11/23
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = (Realizetype)realizetype.clone();
        System.out.println(realizetype == clone);

    }
}
