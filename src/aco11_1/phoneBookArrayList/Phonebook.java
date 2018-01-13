package aco11_1.phoneBookArrayList;
import java.util.ArrayList;

public class Phonebook {

    private int countOfFriends;
    private ArrayList<Friend> friends;

    public Phonebook(int countOfFriends, ArrayList<Friend> friends) {
        this.countOfFriends = countOfFriends;
        this.friends = friends;
    }

    void addUser(Friend friend) {
        friends.add(friend);
        countOfFriends++;

    }
    void delUser(String delName) {
        for (Friend friend : friends) {
            if (friend.getUserName().equals(delName)){
                friends.remove(friend);
            }
    }
    }
    void printUser(Friend friend){
        System.out.println(
                friend.getUserId() + ", " + friend.getUserName() + ", " +
                        friend.getUserPhoneNumber() + ", " + friend.getUserYearOfBirth() + ", " +
                        friend.getUserWeight()
        );
    }
    void printAll() {
        System.out.println("You have" + " " + countOfFriends + " " + "friend(s)");
        for (Friend friend : friends) {
                printUser(friend);
        }
    }

    void searchUser(String name) {
        System.out.println("Searching user" + " " + name);
        int result = 0;
        for (Friend friend : friends) {
            if (friend.getUserName().equalsIgnoreCase(name)) {
                System.out.println("User Found: ");
                printUser(friend);
                result++;
            }
        }
        if (result == 0) {
            System.out.println("No user" + " " + name + " " + "found");
        } else {
            System.out.println("Total" + " " + result + " " + "user(s) " + name + " " + "found");
        }
    }

    public Friend generateNewUser() {

        int userId = generateUserId();
        String userName = generateUserName();
        String userPhoneNumber = generateUserPhoneNumber();
        int userYearOfBirth = generateUserYearOfBirth();
        double userWeight = generateUserWeight();

        Friend friend = new Friend(userId, userName, userPhoneNumber, userYearOfBirth, userWeight);
        return friend;
    }

    public void generateNewUsers(int numGenerate) {
        for (int i = 0; i < numGenerate; i++) {
            Friend friend = generateNewUser();
            addUser(friend);
        }
    }

    public String generateUserPhoneNumber() {
        String phone = "+380";

        for (int i = 0; i < 9; i++) {
            phone += (int) (Math.random() * 10);
        }
        return phone;
    }

    public String generateUserName() {

        String[] names = {"Olga", "Slava", "Yura", "Anfisa", "Katya", "Ivan"};
        return names[(int) (Math.random() * names.length)];

    }

    public int generateUserId() {
        return friends.size();
    }

    public int generateUserYearOfBirth() {
        return generateNum(1980, 1999);
    }

    public double generateUserWeight() {
        return generateNum(60, 99);
    }

    public int generateNum(int min, int max) {

        return min + (max - min) * (int) (Math.random() * 10);
    }


    public int getCountOfFriends() {
        return countOfFriends;
    }

    public void setCountOfFriends(int countOfFriends) {
        this.countOfFriends = countOfFriends;
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Friend> friends) {
        this.friends = friends;
    }
}
