public class Example20 {
    public static void main(String[] args) {
        Example20 o = new Example20();
        o.go();
    }

    void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            System.out.println("y++"+ y++);
            if (x > 4) {
                System.out.println(++y + " -");

            }
            if (y > 14) {
                System.out.println("x = " + x);
                break;
            }
        }
    }
}
