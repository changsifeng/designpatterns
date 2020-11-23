package createpattern.factorymethodpattern;

/**
 * 具体工厂A
 * @author GYF
 * @date 11/23/20
 */
public class FactoryA implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂A生产产品A");
        return new ProductA();
    }
}