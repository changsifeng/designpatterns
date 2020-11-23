package createpattern.abstractfactorypattern.factoryimpl;

import createpattern.abstractfactorypattern.AbstractFactory;
import createpattern.abstractfactorypattern.Color;
import createpattern.abstractfactorypattern.Shape;
import createpattern.abstractfactorypattern.colorimpl.Blue;
import createpattern.abstractfactorypattern.colorimpl.Green;
import createpattern.abstractfactorypattern.colorimpl.Red;

/**
 * @author GYF
 * @date 11/23/20
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }


    @Override
    public Shape getShape(String shape) {
        return null;
    }
}