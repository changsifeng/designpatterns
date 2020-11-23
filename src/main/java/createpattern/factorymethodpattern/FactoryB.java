package createpattern.factorymethodpattern;

/**
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class FactoryB implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂B生产商品B");
        return new ProductB();
    }
}