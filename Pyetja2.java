package Provim;

public class Pyetja2 {
    private String name;
    private String lastName;
    private int age;
    private char gender;
    private String address;
    private String number;

    public Pyetja2(String name, String lastName, int age, char gender, String address, String number) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.number = number;
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

    public int getAge() {
        return 2022 - age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return name + "\t" + lastName + "\t" + age + "\t" + gender + "\t" +
                address + "\t" + number + "\t" + "i lindur ne vitin: " + "\t" +
                getAge();
    }

    public String dispFemale() {
        return name + "\t" + lastName + "\t" + age + "\t" + gender + "\t" +
                address + "\t" + number + "\t" + "e lindur ne vitin:\t" +
                getAge();
    }

    public static void main(String[] args) {
        Pyetja2 obj1 = new Pyetja2("Jakup", "Sinani", 22, 'M', "Rr.110", "071222333");
        Pyetja2 obj2 = new Pyetja2("Sanije", "Sinani", 32, 'F', "RR.101", "072444555");
        Pyetja2 obj3=new Pyetja2("Florije","Sinani",31,'F',"Rr.102","073666777");
        System.out.println(obj1.toString());
        System.out.println(obj2.dispFemale());
        System.out.println(obj3.dispFemale());
    }
}
