public class SalariedEmployee extends Employee{

    private double weeklySalary;

    //constructor
    public SalariedEmployee(String firstName, String lastName,String socialSecurityNumber, double weeklySalary)
    {
        super(firstName,lastName,socialSecurityNumber);

        if(weeklySalary<0.0)
            throw new IllegalArgumentException(
                    "weekly salary must be >=0.0");

        this.weeklySalary=weeklySalary;
    }

    //set salary
    public void setWeeklySalary(double weeklySalary)
}
