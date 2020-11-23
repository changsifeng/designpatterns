package createpattern.abstractfactorypattern.colorimpl;

import createpattern.abstractfactorypattern.Color;

/**
 * @author GYF
 * @date 11/23/20
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}