package Youtube;

public class Film {
    String title;
    String director;
    String rating;
    static int numOfs;

    public Film(String title, String director, String rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
        numOfs++;
    }

    public static void main(String[] args) {
        Film obj1 =new Film("The Avengers","Joss Whedon","PG-13");
        Film obj2=new Film("Step Brothers","Adam Mickey","R");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
