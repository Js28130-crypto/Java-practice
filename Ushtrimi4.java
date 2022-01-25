package Ushtrime1;

class Persona {
    public static String name = "Jakup";        //local-variable
    public static String surname = "Sinani";    //local-variable
    public static int age = 22;     //local-variable
    public static char gender = 'M';        //local-variable
    public static String address = "Sellarc";   //local-variable
    public static String number = "070-000-000";    //local-variable

    public static String namee = "Emir";    //local-variable
    public static String surnamee = "Aliu";     //local-variable
    public static int agee = 19;        //local-variable
    public static char genderr = 'M';       //local-variable
    public static String addresss = "Sellarc";      //local-variable
    public static String numberr = "070-111-111";       //local-variable
}

public class Ushtrimi4 {
    //main method
    public static void main(String[] args) {
        System.out.println("Name: " + Persona.name + "\n");
        System.out.println("Surname: " + Persona.surname + "\n");
        System.out.println("Age: " + Persona.age + "\n");
        System.out.println("Gender: " + Persona.gender + "\n");
        System.out.println("Address: " + Persona.address + "\n");
        System.out.println("Number: " + Persona.number + "\n");

        System.out.println("Name: " + Persona.namee + "\n");
        System.out.println("Surname: " + Persona.surnamee + "\n");
        System.out.println("Age: " + Persona.agee + "\n");
        System.out.println("Gender: " + Persona.genderr + "\n");
        System.out.println("Address: " + Persona.addresss + "\n");
        System.out.println("Number: " + Persona.numberr + "\n");


        System.out.println("Mosha mesatare eshte: " + getDivision(getSum(Persona.age, Persona.agee)));
    }
        //return method
    private static int getSum(int age, int agee) {
        return age+agee;
    }
    //return method
    private static int getDivision(int age) {
        return age/2;
    }

}
