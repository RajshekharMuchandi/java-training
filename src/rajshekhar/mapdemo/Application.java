package rajshekhar.mapdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        List<Employee> employees = getEmployee();
        Set<Employee> employeeSet = new HashSet<>(employees);


        System.out.println("List of employees in set :");
        for(Employee employee : employeeSet){
            System.out.println(employee);
        }
    }

    private static List<Employee> getEmployee(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("100002", "SACHIN", "SOFTWARE ENGINEER", "PUNE"));
        employees.add(new Employee("100002", "RAJ", "SOFTWARE ENGINEER", "PUNE"));
        return employees;
    }
}
