package learningJavaCh02;

/**
 * Created by Ditya on 8/9/2016.
 */
public class Employee04 {
    private static int lastId = 0;
    private int id;
    private String name;
    private double salary;

    public Employee04(){
        lastId++;
        id = lastId;
    }
    public Employee04(String name, double salary){
        this();
        this.name = name;
        this.salary = salary;
    }
    public void raiseSalary(double byPercent){
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
