package learningJavaCh02;

/**
 * Created by Ditya on 8/9/2016.
 */
public class InvoiceDemo {
    public static void main(String[] args){
        Invoice invoice = new Invoice();
        invoice.addItem("Blackwell Toaster", 2, 24.95);
        invoice.addItem("ZapXpress Microwave Oven", 1, 49.95);
        invoice.print();
    }
}
