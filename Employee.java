
package Employeeeee;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    //this is the constructor of the class Employee
    public Employee(String name){
        this.name=name;
    }

    //assign the age of the Employee to the variable age.
    public void EmpAge(int empAge){
        age =empAge;
    }

    //asign the designation to the variable designation
    public void empDesignation(String empDesig){
        designation=empDesig;
    }

    //Assign the salary to the variable salary.
    public void empSalary(double empSalary){
        salary=empSalary;
    }

    //print the Employee details
    public void printEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: " +salary);
    }
}
