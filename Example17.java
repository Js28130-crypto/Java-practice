public class Example17 {
    public static void main(String[] args) {
        int orig = 42;
        Example17 x = new Example17();
        int y = x.go(orig);
        System.out.println(orig+" "+y);
    }
    int go(int arg){
        arg = arg *2;
        return arg;
    }
}
