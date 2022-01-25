import java.lang.reflect.Array;
import java.util.ArrayList;

public class Example10 {
    public static void main(String[] args) {
        //ArrayList = a resizable array.
        //Elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("burger");
        food.add("hotdog");

        for (int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
