package Youtube;

public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }
    static void displayFriends(){
        System.out.println("You have "+numberOfFriends+" Friends");
    }

    public static void main(String[] args) {
        Friend friend=new Friend("patrick");
        Friend friend1=new Friend("Spongebob");
        displayFriends();
    }
}
