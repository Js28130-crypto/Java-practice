package Employeeeee;

public class EmployeeTest {
    public static void main(String[] args) {
        //create two object using constructor
        Employee empOne= new Employee("Jakup Sinani");
        Employee empTwo=new Employee("Kaltrina Sinan");

        //invoking methods for each object created
        empOne.EmpAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.EmpAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
