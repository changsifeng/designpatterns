package createpattern.factorymethodpattern;

/**
 * 具体商品B
 * @author GYF
 * @date 11/23/20
 */
public class ProductB implements Product {
    @Override
    public void show() {
        System.out.println("具体商品B展示");
    }
}