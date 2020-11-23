package createpattern.abstractfactorypattern.shapeimpl;

import createpattern.abstractfactorypattern.Shape;

/**
 * @author GYF
 * @date 11/23/20
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}