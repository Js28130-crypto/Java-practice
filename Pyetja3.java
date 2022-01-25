package Provim;

public class Pyetja3 {
    private String name;
    private String lastName;
    private char gender;
    private String number;
    private int age;

    public Pyetja3(String name, String lastName, char gender, String number, int age) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return 2022-age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "\n" + lastName + "\n" + age + "\n" + gender + "\n" +
                  number + "\n" + "Mosha: " +
                age+"\n";
    }
    public String disp(){
        return "Numri i karaktereve eshte: "+toString().length();

    }

    public static void main(String[] args) {
        Pyetja3 obj1=new Pyetja3("Jakup","Sinani",'M',"071222333",22);
        System.out.println(obj1.toString()+obj1.disp());

    }
}
