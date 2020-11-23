package createpattern.abstractfactorypattern.shapeimpl;

import createpattern.abstractfactorypattern.Shape;

/**
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}