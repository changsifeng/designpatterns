package createpattern.abstractfactorypattern.colorimpl;

import createpattern.abstractfactorypattern.Color;

/**
 * @author GYF
 * @date 11/23/20
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}