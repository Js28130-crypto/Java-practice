class Myclass{
 static String name ="John";
    String lastName;
    static String text="Hello ";

    @Override
    public String toString() {
        return  text+"world!";
    }



    public String getName() {
        return name;
    }

    public void setName(String emri) {
        this.name = emri;
        System.out.println("Hello "+emri+"!");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String mbiemri) {
        this.lastName=mbiemri;
        System.out.println("Hello "+name+" "+lastName+"!");

    }

}
class Someclass extends Myclass{


    public Someclass(String emri) {
        System.out.println("Helllo "+emri+"!");
    }

    public Someclass(String name, String mbiemri) {
        super();
        System.out.println("Hello "+name+" "+mbiemri+"!");
    }
}
public class Class {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        System.out.println(obj);
        obj.setName("John");
        System.out.println(obj);
        obj = new Someclass("Joe");
        System.out.println(obj);
        obj.setLastName("Doe");
        System.out.println(obj);
        obj=new Someclass("Jane","Doe");
        System.out.println(obj);

    }
}