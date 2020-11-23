package createpattern.simplefactorypattern;

/**
 * 调用客户端
 * @author GYF
 * @date 11/23/20
 */
public class Client {
    public static void main(String[] args){
        Product product = SimpleFactory.makeProduct(1);
        product.show();

    }
}