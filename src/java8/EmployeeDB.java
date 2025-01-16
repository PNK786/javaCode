package src.java8;

import java.util.Arrays;
import java.util.List;

public class EmployeeDB
{
    public static List<Employee>empDetails()
    {
        List<Employee>list=Arrays.asList(

                new Employee(101,"karthik","IT", 50000L),
                new Employee(102,"kiran","IT", 60000L),
                new Employee(103,"joydeep","HR", 70000L),
                new Employee(104,"ravindra","HR", 40000L),
                new Employee(105,"shravaan","Prod", 30000L),
                new Employee(106,"kishore","Prod", 20000L)
        );
        return list;
    }
}
