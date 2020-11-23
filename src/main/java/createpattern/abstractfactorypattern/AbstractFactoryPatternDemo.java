package createpattern.abstractfactorypattern;

/**
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color red = color.getColor("red");
        red.fill();
    }
}