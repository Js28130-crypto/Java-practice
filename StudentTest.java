package Test;
//Student class that stores a student name and average.
public class StudentTest {
    public static void main(String[] args) {
        Student account1=new Student("Jakup Sinani",93.8);
        Student account2=new Student("Kaltrina Sinani",85.3);
        System.out.println(account1.getName(),account1.getLetterGrade());
        System.out.println(account1.getName(),account1.getLetterGrade());
    }
}
class Student {
    private String name;
    private double average;

    //constructor initializes instance variables
    public Student(String name, double average){
        this.name=name;

        //validate that average is >0.0 and <=100; otherwise
        //keep instance variable average's default value(0.0)
        if(average >0.0)
            if(average<=100)
                this.average=average;//assign to instance variable
    }

    //sets the students name
    public void setName(String name){
        this.name=name;
    }

    //retrieves the students name
    public String getName(){
        return name;
    }

    //sets the Students average
    public void setAverage(double studentAverage){
        //validate that average is>0.0 and <=100.0 otherwise,
        //keep instance variiable averages current value.
        if(average>0)
            if (average <=100.0)
                this.average=average;//assign to instance variable
    }

    //retrieves the students average
    public double getAverage(){
        return average;
    }

    //determines and returns the students letter grade
    public String getLetterGrade(){
        String letterGrade=" ";//initialied to empty String

        if(average>=90.0)
            letterGrade="A";
        else if(average>=80.0)
            letterGrade="B";
        else if(average>=70)
            letterGrade="C";
        else if(average>=60)
            letterGrade="D";
        else
            letterGrade="F";
        return letterGrade;
    }
}


