package Person;
import java.util.*;
public class Employee{
    protected String name;
    protected long salary;

    public Employee(){}

    public Employee(String name){
        this.name = name;
    }

    public String typeOfEmp(){
        return " ";
    }

    public void in(){
        System.out.println("---- Name of the staff : " + name + " ----");
        System.out.println("Type of staff : " + typeOfEmp());
        System.out.println("Salary : " + salary);
    }
}

