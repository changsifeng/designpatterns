package createpattern.abstractfactorypattern;

/**
 * 抽象工厂
 * @author GYF
 * @date 11/23/20
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}