package learningJavaCh02;

/**
 * Created by Ditya on 8/9/2016.
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardForm {
    private static final ArrayList<Integer> expirationYear = new ArrayList<>();
    static {
        //Add the next twenty years to the array List
        int year = LocalDate.now().getYear();
        for (int i = year; i <= year + 20; i++){
            expirationYear.add(i);
        }
    }
}
