package learningJavaCh02;

/**
 * Created by Ditya on 8/9/2016.
 */
public class EmployeeDemo01 {
    public static void main(String[] args){
        Employee01 james = new Employee01("James Bond", 500000);
          // calls Employee(String, double) constructor
        Employee01 anonymous = new Employee01("", 40000);
          // calls Employee(double) constructor
        Employee01 unpaid = new Employee01("Igor Intern");
        Employee01 e = new Employee01();
         // no-arg constructor
    }
}
