package Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employe emp= new Employe("Jakup","Sinani",1100);
        Employe emp1=new Employe("Sanije ","Sinani",-58.2);

        System.out.println(emp.toString());
        System.out.println(emp1.toString());
        System.out.println();

        emp1.setSalary(1500);

        System.out.println("Name: "+emp.getName()+" \nYearly Salary: "+emp.yearSalary());
        System.out.println("Name: "+emp1.getName()+" \nYearly Salary: "+emp1.yearSalary());


    }
}
