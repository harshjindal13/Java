import java.util.*;

class Employee {
    int empNo, basic, hra, it;
    String name, dept, desigCode;
    
    Employee(int empNo, String name, String desigCode, String dept, int basic, int hra, int it) {
        this.empNo = empNo;
        this.name = name;
        this.desigCode = desigCode;
        this.dept = dept;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}

public class EmployeeInfoLookup {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Project1 <empId>");
            return;
        }
        
        int empId = Integer.parseInt(args[0]);
        Map<Integer, Employee> employees = new HashMap<>();
        employees.put(1001, new Employee(1001, "Ashish", "e", "R&D", 20000, 8000, 3000));
        employees.put(1002, new Employee(1002, "Sushma", "c", "PM", 30000, 12000, 9000));
        employees.put(1003, new Employee(1003, "Rahul", "k", "Acct", 10000, 8000, 1000));
        employees.put(1004, new Employee(1004, "Chahat", "r", "Front Desk", 12000, 6000, 2000));
        employees.put(1005, new Employee(1005, "Ranjan", "m", "Engg", 50000, 20000, 20000));
        employees.put(1006, new Employee(1006, "Suman", "e", "Manufacturing", 23000, 9000, 4400));
        employees.put(1007, new Employee(1007, "Tanmay", "c", "PM", 29000, 12000, 10000));
        
        if (!employees.containsKey(empId)) {
            System.out.println("There is no employee with empid: " + empId);
            return;
        }
        
        Employee emp = employees.get(empId);
        String designation = "";
        int da = 0;
        
        switch (emp.desigCode) {
            case "e": designation = "Engineer"; da = 20000; break;
            case "c": designation = "Consultant"; da = 32000; break;
            case "k": designation = "Clerk"; da = 12000; break;
            case "r": designation = "Receptionist"; da = 15000; break;
            case "m": designation = "Manager"; da = 40000; break;
        }
        
        int salary = emp.basic + emp.hra + da - emp.it;
        System.out.println("Emp No. Emp Name Department Designation Salary");
        System.out.println(emp.empNo + " " + emp.name + " " + emp.dept + " " + designation + " " + salary);
    }
}

