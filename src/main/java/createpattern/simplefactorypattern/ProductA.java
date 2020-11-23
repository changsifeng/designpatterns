package createpattern.simplefactorypattern;

/**
 * 具体商品A
 * @author GYF
 * @date 11/23/20
 */
public class ProductA implements Product {
    @Override
    public void show() {
        System.out.println("具体商品A展示");
    }
}