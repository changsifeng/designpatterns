package createpattern.prototypepattern;

/**
 * 具体原型类
 * 必须实现Cloneable接口
 * @author GYF
 * @date 2020/11/23
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体原型模式创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型模式复制成功");
        return (Realizetype)super.clone();
    }
}
