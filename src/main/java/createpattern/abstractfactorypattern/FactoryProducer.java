package createpattern.abstractfactorypattern;

import createpattern.abstractfactorypattern.factoryimpl.ColorFactory;
import createpattern.abstractfactorypattern.factoryimpl.ShapeFactory;

/**
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}