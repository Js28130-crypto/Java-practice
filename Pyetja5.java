package Provim;

public class Pyetja5 {
    static String txt="Ju keni zgjedhur";

    public static void main(String[] args) {
        int month = 8;
        String monthstring;
        switch (month) {
            case 1:  monthstring = "Janar";
                break;
            case 2:  monthstring = "Shkurt";
                break;
            case 3:  monthstring = "Mars";
                break;
            case 4:  monthstring = "Pril";
                break;
            case 5:  monthstring = "Maj";
                break;
            case 6:  monthstring = "Qeshor";
                break;
            case 7:  monthstring = "Korrik";
                break;
            case 8:  monthstring = "Gusht";
                break;
            case 9:  monthstring = "Shtator";
                break;
            case 10: monthstring = "Tetor";
                break;
            case 11: monthstring = "Nentor";
                break;
            case 12: monthstring = "Dhjetor";
                break;
            default: monthstring = "Errorrr";
                break;
        }
        System.out.println(txt+" "+monthstring);
    }
}