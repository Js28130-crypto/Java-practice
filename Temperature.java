package TemperatureConversions;

import java.util.Scanner;

public class Temperature {
    static double celcius(double f){
        return celcius(5.0/9.0*(f-32));
    }
    static double fahrenheit(double c){
        return fahrenheit(9.0/5.0*c+32);
    }

    public static void main(String[] args) {
        double a,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature: ");
        a= in.nextDouble();
        System.out.println("Celcius temperature is: "+celcius(a));
        System.out.println("Enter Celcius temperature: ");
        d= in.nextDouble();
        System.out.println("Fahrenheit temperature is: "+fahrenheit(d));

    }
}