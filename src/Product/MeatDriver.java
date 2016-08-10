package Product;

/**
 * Created by Ditya on 8/10/2016.
 */
public class MeatDriver {

    public static void main(String[] args){
        Meat meat = new Meat(MeatProduct.CHICKEN_LEVER);
        Double price = meat.getMeatProduct().getCutType().getPrice();
        System.out.println(price);

    }
}
