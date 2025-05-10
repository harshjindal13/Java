// package com.prj1; 

public class SolnEmployeeInfoLookup { 

  static class Employee { 
         int empNo; 
         String empName; 
         String joinDate; 
         char desigCode; 
         String department; 
         int basic; 
         int hra; 
         int it; 

         Employee(int empNo, String empName, String joinDate, char desigCode, String department, int basic, int hra, int it) { 
             this.empNo = empNo; 
             this.empName = empName; 
             this.joinDate = joinDate; 
             this.desigCode = desigCode; 
             this.department = department; 
             this.basic = basic; 
             this.hra = hra; 
             this.it = it; 
         }
  } 

  public static String getDesignation(char code) { 
         switch (code) { 
             case 'e': return "Engineer"; 
             case 'c': return "Consultant"; 
             case 'k': return "Clerk"; 
             case 'r': return "Receptionist"; 
             case 'm': return "Manager"; 
             default: return "Unknown"; 
         } 
  } 

  public static int getDA(char code) { 
         switch (code) { 
             case 'e': return 20000; 
             case 'c': return 32000; 
             case 'k': return 12000; 
             case 'r': return 15000; 
             case 'm': return 40000; 
             default: return 0; 
         } 
  } 

  public static void main(String[] args) { 
         Employee[] employees = { 
             new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000), 
             new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000), 
             new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000), 
             new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000), 
             new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000), 
             new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400), 
             new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000) 
         }; 

         if (args.length != 1) { 
             System.out.println("Please provide an employee ID."); 
             return; 
         } 

         int empId = Integer.parseInt(args[0]); 
         boolean found = false; 

         for (Employee emp : employees) { 
             if (emp.empNo == empId) { 
                 String designation = getDesignation(emp.desigCode); 
                 int da = getDA(emp.desigCode); 
                 int salary = emp.basic + emp.hra + da - emp.it; 

                 System.out.println("Emp No. Emp Name Department Designation Salary"); 
                 System.out.printf("%d %s %s %s %d\n", emp.empNo, emp.empName, emp.department, designation, salary); 

                 found = true; 
                 break; 
             } 
         } 

         if (!found) { 
             System.out.println("There is no employee with empid: " + empId); 
         } 
  } 
}

