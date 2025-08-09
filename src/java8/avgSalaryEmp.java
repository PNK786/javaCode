package src.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class avgSalaryEmp
{
    public static void main(String[] args) {

        Map<String, Double> avgSalarybyDept = EmployeeDB.empDetails().stream()
                         .collect(Collectors.groupingBy(Employee::getDept,
                Collectors.averagingDouble(
                        Employee::getSalary)));

        System.out.println(avgSalarybyDept);
    }
}
