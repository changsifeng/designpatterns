package createpattern.abstractfactorypattern;

/**
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}