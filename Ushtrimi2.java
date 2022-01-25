package Ushtrime1;

class Personi {
    public static String name = "Jakup";    //local-variabla
    public static String surname = "Sinani";    //local-variabla
    public static int age = 22; //local-variabla
    public static char gender = 'M';    //local-variabla
    public static String address = "Sellarc";   //local-variabla
    public static String number = "070-000-000";    //local-variabla

    public static int getAge() {
        //method
        return age;
    }
}

public class Ushtrimi2 {
    public static void main(String[] args) {

        System.out.println("Name: " + Persona.name + "\n");
        System.out.println("Surname: " + Persona.surname + "\n");
        System.out.println("Age: " + Persona.age + "\n");
        System.out.println("Gender: " + Persona.gender + "\n");
        System.out.println("Address: " + Persona.address + "\n");
        System.out.println("Number: " + Persona.number + "\n");
        //if-else condition
        if (Personi.getAge() <= 60) {
            System.out.println("eshte i ri");
        } else {
            System.out.println("eshte plak");
        }
    }
}

