package createpattern.factorymethodpattern;

/**
 * @author Gu Yong Feng
 * @date 11/23/20
 */
public class FactoryTest {
    public static void main(String[] args){
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}