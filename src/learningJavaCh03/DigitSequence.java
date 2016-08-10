package learningJavaCh03;

/**
 * Created by Ditya on 8/9/2016.
 */
public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int n){
        number = n;
    }
    public boolean hasNext(){
        return number != 0;
    }
    public int next(){
        int result = number % 10;
        number /= 10;
        return result;
    }
    public int rest(){
        return number;
    }
}
