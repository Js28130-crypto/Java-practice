import java.io.*;       //package for stream readers
import java.util.Scanner;

//NameDriver application
//this application inputs a name and print it in
//two different formats.0
public class Example13 {
    public static void main(String[] args) throws IOException {
        String FIRST="Jakup";
        String LAST="Sinani";
        String MIDDLE="K";
        String firstlast;
        String lastfirst;
        String firstInitialLast;
        BufferedReader in;
        in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first name: ");
        FIRST=in.readLine();
        System.out.println("Enter last name: ");
        LAST=in.readLine();
        System.out.println("Enter middle initial: ");
        MIDDLE=in.readLine();
        firstlast=FIRST+" "+LAST;
        System.out.println("Name in first-last format is "+firstlast);
        lastfirst=LAST+", "+FIRST+", ";
        System.out.println("Name in last-first-initial"+lastfirst+MIDDLE+".");
        firstInitialLast=FIRST+" "+MIDDLE+". "+LAST;
        System.out.println("Name in first-initial-last format is "+firstInitialLast);


    }
    }
