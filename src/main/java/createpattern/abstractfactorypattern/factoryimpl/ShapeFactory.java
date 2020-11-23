package createpattern.abstractfactorypattern.factoryimpl;

import createpattern.abstractfactorypattern.AbstractFactory;
import createpattern.abstractfactorypattern.Color;
import createpattern.abstractfactorypattern.Shape;
import createpattern.abstractfactorypattern.shapeimpl.Circle;
import createpattern.abstractfactorypattern.shapeimpl.Rectangle;
import createpattern.abstractfactorypattern.shapeimpl.Square;

/**
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}