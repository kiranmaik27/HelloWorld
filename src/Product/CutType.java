package Product;

/**
 * Created by Ditya on 8/10/2016.
 */
public enum CutType {
    LEGS(20.00), LIVER(15.00);

    private Double price;

    private CutType (Double price){
        this.price = price;
    }

    public Double getPrice() {return price;}

}
