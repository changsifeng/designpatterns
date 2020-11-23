package createpattern.factorymethodpattern;

/**
 * 具体商品A
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class ProductA implements Product {
    @Override
    public void show() {
        System.out.println("具体商品A展示");
    }
}