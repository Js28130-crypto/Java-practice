package BMI;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile obj1=new HealthProfile("Jakup","Sinani",'M',23,12,1999,  1.75,91);
        System.out.println(obj1.toString());
        System.out.println();
        System.out.println("------------------");
        System.out.println();
        System.out.println(obj1.disp());
    }
}
