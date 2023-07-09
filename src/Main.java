import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<MyFriends> myList = new ArrayList<>();
        List<MyFriends> myList2 = new ArrayList<>();

        myList.add(new MyFriends("Jack","nope","Investing"));
        myList.add(new MyFriends("Junior","yes", "boring life"));
        myList.add(new MyFriends("Pink","yes","Like Movie"));
        myList.add(new MyFriends("Top","yes", "I like castify"));

        Scanner mySc = new Scanner(System.in);
        System.out.println(myList.size());
        String mainHi = "Hi, welcome to remember friends app :p";

        String choiceA = "- Select (A) for adding new friend to your list.";
        String choiceL = "- Select (l) for showing all your friends.";
        String choiceR = "- Select (R) for randomly call your friends.";
        String choiceS = "- Select (S) for showing how many friends do I have.";
        String choiceM = "- Select (M) for matching interest.";
        String choiceQuit = "(Q) to quit program.";

        boolean programRunning = true;

        try {

            while (programRunning) {

                System.out.printf(mainHi + "%n" +
                        "   " + choiceA + "%n" +
                        "   " + choiceL + "%n" +
                        "   " + choiceR + "%n" +
                        "   " + choiceS + "%n" +
                        "   " + choiceM + "%n" +
                        "   " + choiceQuit + "%n");

                String myChoice = mySc.nextLine().toLowerCase();

                // Total friends
                int allFriend = myList.size() + myList2.size();

                switch (myChoice) {

                    case "a" -> {
                        Scanner friend = new Scanner(System.in);

                        System.out.println("What is his/her name ?");
                        String newFriend = friend.nextLine();

                        System.out.println("Is he/she is your close friend");
                        String statusFriend = friend.nextLine();

                        System.out.println("What do their hobby ?");
                        String theirInterest = friend.nextLine();

                        if (statusFriend == null) {
                            throw new InputMismatchException("please enter how close your friend are . . .");
                        }

                        myList.add(new MyFriends(newFriend, statusFriend, theirInterest));
                    }
                    case "l" -> System.out.println(myList);
                    case "r" -> {

                        if (myList.size() != 0) {

                            MyFriends selectedRandomFriend = myList.get((int)Math.random());

                            System.out.println("Random friends is " + selectedRandomFriend);

                            myList.remove(selectedRandomFriend);
                            System.out.println("First List : " + myList);
                            System.out.println("First List size : " + myList.size());

                            myList2.add(selectedRandomFriend);
                            System.out.println("Second List : " + myList2);

                        }else if (myList.isEmpty()){

                            myList = myList2;
                        }
                    }
                    case "s" -> System.out.println("I have total of => " + myList.size() + " friends right now.");

                    case "m" -> {
                        System.out.println("");
                    }
                    // Next step I want to add one more 'Interesting Topic to each of my friends object'
                    // And create new switch case (case "m") for finding matching friends who have similar interests
                    // with you...
                    // We might need to do something relate to Comparator || Comparable to do this.

                    case "q" -> {
                        System.out.println("Quitting the program . . .");
                        programRunning = false;
                    }

                    default -> System.out.println("pls select one choice provide.");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Input is invalid. Please try to follow the choice carefully");
            mySc.nextLine();
        }

        System.out.println(myList);
    }
}