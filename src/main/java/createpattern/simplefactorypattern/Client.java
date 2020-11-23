package createpattern.simplefactorypattern;

/**
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class Client {
    public static void main(String[] args){
        Product product = SimpleFactory.makeProduct(1);
        product.show();

    }
}