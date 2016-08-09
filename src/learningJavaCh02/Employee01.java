package learningJavaCh02;

/**
 * Created by Ditya on 8/9/2016.
 */
import java.util.Random;

public class Employee01 {
    private String name = "";
    private double salary;
    private final int id;

    {// An initialization block
        Random generator = new Random();
        id = 1 + generator.nextInt(1_000_000);
    }
    public Employee01(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public Employee01(double salary) {
        //name already set to ""
        this.salary = salary;
    }
    public Employee01(String name){
        //salary already set to 0
        this.name = name;
    }
    public Employee01(){
        this("", 0);
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
}
