package learningJavaCh02;

/**
 * Created by Ditya on 8/9/2016.
 */
public class EmployeeDemo {
    public static void main(String[] args){
        Employee fred = new Employee("Fred", 50000);
        fred.raiseSlary(10);
        System.out.println(fred.getName());
        System.out.println(fred.getSalary());
    }
}
