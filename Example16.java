public class Example16 {
    public static void main(String[] args) {
        Example16Test one = new Example16Test();
        one.size=70;
        Example16Test two= new Example16Test();
        two.size=8;
        Example16Test three = new Example16Test();
        three.size=35;
        Example16Test d = new Example16Test();


        one.bark();
        two.bark();
        three.bark();
    }

}
class Example16Test{
    int size;
    String name;
    void bark(){
        if (size>60){
            System.out.println("woof woof");
        }else if (size>14){
            System.out.println("ruff ruff");
        }else
        {
            System.out.println("yip yip");
        }


    }
}
