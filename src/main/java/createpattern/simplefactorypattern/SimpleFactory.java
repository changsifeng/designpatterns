package createpattern.simplefactorypattern;

/**
 * 简单工厂
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class SimpleFactory {
    public static Product makeProduct(int kind){
        switch (kind){
            case Const.PRODUCT_A:
                return new ProductA();
            case Const.PRODUCT_B:
                return new ProductB();
        }
        return null;
    }
}