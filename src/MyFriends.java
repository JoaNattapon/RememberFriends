import java.util.ArrayList;
import java.util.List;

public class MyFriends {

    private final String name;
    private final String isCloseFriend;
    private String interests;

    public MyFriends(String name, String isCloseFriend, String interests) {
        this.name = name;
        this.isCloseFriend = isCloseFriend;
        this.interests = "so so life";
    }

    public String getName() {
        return name;
    }

    public String isCloseFriend() {
        return isCloseFriend;
    }

    public String getIsCloseFriend() {
        return isCloseFriend;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "{" +
                 name + ", " +
                 isCloseFriend + ", " +
                 interests +
                '}';
    }

    // Copy one ArrayList to another ArrayList
    public static List<MyFriends> transferArray(ArrayList<MyFriends> originArray) {

        List<MyFriends> targetArrayList = new ArrayList<>();

        for (MyFriends myArray : originArray) {

            MyFriends copiedObj = new MyFriends(myArray.getName(), myArray.getIsCloseFriend(), myArray.getInterests());
            targetArrayList.add(copiedObj);
        }

        return targetArrayList;
    }
}
