package learningJavaCh03;

/**
 * Created by Ditya on 8/9/2016.
 */
public class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext(){
        return true;
    }
    public int next(){
        i++;
        return i * i;
    }
}
