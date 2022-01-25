package Provim;

public class Pyetja4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 30; i = i + 3) {
            System.out.println(i);
            sum += i;
            if (i == 30) {
                for (int j = i + 5; j <= 100; j = j + 5) {
                    System.out.println(j);
                    sum += j;
                }
            }
        }
        System.out.println("Totali i numrave eshte: " + sum);
    }
}
