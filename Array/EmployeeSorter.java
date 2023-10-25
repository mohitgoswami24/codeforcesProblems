package Array;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Employee {
    String companyName;
    String employeeName;
    Date joinDate;

    public Employee(String companyName, String employeeName, Date joinDate) {
        this.companyName = companyName;
        this.employeeName = employeeName;
        this.joinDate = joinDate;
    }

    public Date getJoinDate() {
        return joinDate;
    }
}

public class EmployeeSorter {
    public static void main(String[] args) throws ParseException {
        String input = "company name,Company Employee Name,comapny person joinning date (MM DD YY),Lambdatest,Rahul,01/01/21,Lambdatest,Joy,21/05/19,Lambdatest,Himanshi,23/12/20,Lambdatest,Rachit,01/01/23,Lambdatest,Surendra,06/04/23,Lambdatest,Amit,11/04/22,Lambdatest,Ramesh,13/08/17,Lambdatest,Ajay,21/11/21,Lambdatest,Jitendra,11/12/21,Lambdatest,Rajesh,03/09/22,Lambdatest,Nitesh,07/07/20,Lambdatest,Harish,02/02/23,Lambdatest,Rameshwer,01/04/21,Lambdatest,Amey,08/05/19,Lambdatest,Mukul,02/10/20,Lambdatest,Jackson,19/04/22";

        String[] lines = input.split("\n");
        List<Employee> employees = new ArrayList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");

        for (int i = 1; i < lines.length; i++) {
            String[] parts = lines[i].split(",");
           
            String companyName = parts[0];
            String employeeName = parts[1];
            Date joinDate = dateFormat.parse(parts[2]);
            employees.add(new Employee(companyName, employeeName, joinDate));
        }

        employees.sort(Comparator.comparing(Employee::getJoinDate));

        for (Employee employee : employees) {
            System.out.println(employee.companyName + " " + employee.employeeName + " " + dateFormat.format(employee.joinDate));
        }
    }
}

