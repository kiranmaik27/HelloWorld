package learningJavaCh02;

/**
 * Created by Ditya on 8/9/2016.
 */
import java.util.Random;

public class EvilManager {
    private Random generator;

    public EvilManager() {
        generator = new Random();
    }

    public void giveRandomRaise(Employee e) {
        double percentage = 10 * generator.nextDouble();
        e.raiseSlary(percentage);
    }
    public void increaseRandomly(double sales) {
        double incsales = sales * 10 * generator.nextGaussian();
        sales += incsales;
    }
    public void replaceWithZombie(Employee e){
        e = new Employee("", 0);
    }
}
