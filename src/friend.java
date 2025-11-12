public class friend {
    String name;
    static int numOfFriends;

    friend(String name){
        this.name = name;
        numOfFriends++;

    }

    static void showFriends(){
        System.out.println("You have "+ numOfFriends+ " total friends");
    }
}
