package Ushtrime1;

class Person {

    //konstruktori
    public Person(String emri, String mbiemri, int mosha, char gjinia, String adresa, String numri) {//parametrat
        String name = emri;             //local-variabla
        String surname = mbiemri;       //local-variabla
        int age = mosha;                //local-variabla
        char gender = gjinia;             //local-variabla
        String address = adresa;          //local-variabla
        String number = numri;            //local-Variabla
        System.out.println(" Emri:" + emri + "\n" + " Mbiemri:" + mbiemri + "\n" + " Mosha: " + mosha + "\n" + " Gjinia: " + gjinia + "\n" + " Adresa: " + adresa + "\n" + " Numri: " + numri);
    }

}

public class Ushtrimi1 {
    public static void main(String[] args) {
        //thirja e konstruktorit
        new Person("Jakup", "Sinani", 22, 'M', "Sellarc", "070-000-000");
    }
}


