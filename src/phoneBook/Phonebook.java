package phoneBook;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class Phonebook {

    private int countOfFriends;
    private Friend[] friends;

    public Phonebook(Friend[] friends) {
        this.countOfFriends = countOfFriends;
        this.friends = friends;
        countOfFriends = friends.length;
    }

    public int getCountOfFriends() {
        return countOfFriends;
    }

    public Friend[] getFriends() {
        return friends;
    }

    public void setCountOfFriends(int countOfFriends) {
        this.countOfFriends = countOfFriends;
    }

    public void setFriends(Friend[] friends) {
        this.friends = friends;
    }

    void addUser(Friend friend) {
        Friend[] newFriends = Arrays.copyOf(friends, friends.length+1);
        newFriends[friends.length] = friend;
        friends = newFriends;
        countOfFriends++;

    }

    void delUser(String delName) {
        Friend[] newFriends = new Friend[friends.length-1];
        int counter = 0;
        for (int i = 0; i < newFriends.length; i++) {
            if (!friends[i].getUserName().equals(delName)) {
                newFriends[counter] = friends[i];   // я так понимаю что проблема в том что тут я
                // указываю на объект, который потом же затираю
                //при переключении ссылки
                counter++;
            }
        }
        friends = newFriends;
        countOfFriends--;


        /*Friend[] newFriends = new Friend[friends.length-1];
        int removedIdx = -1;
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].getUserName().equals(delName)) {
                removedIdx = i;
            }
        }

        if(removedIdx >= 0 ) {
            System.arraycopy(friends, removedIdx + 1, newFriends, removedIdx, friends.length - 1 - removedIdx);
        }
        friends = newFriends;
        countOfFriends--;*/
    }

    void printAll() {
        System.out.println("You have" + " " + countOfFriends + " " + "friend(s)");
        for (int i = 0; i < friends.length; i++) {
            System.out.println(
                    friends[i].getUserId() + ", " + friends[i].getUserName() + ", " +
                            friends[i].getUserPhoneNumber() + ", " + friends[i].getUserYearOfBirth() + ", " +
                            friends[i].getUserWeight()
            );
        }
    }

    void searchUser(String name) {
        System.out.println("Searching user" + " " + name);
        int result = 0;
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].getUserName().equalsIgnoreCase(name)) {
                System.out.println("User Found: " +
                        friends[i].getUserId() + ", " + friends[i].getUserName() + ", " +
                        friends[i].getUserPhoneNumber() + ", " + friends[i].getUserYearOfBirth() + ", " +
                        friends[i].getUserWeight()
                );
                result++;
            }
        }
        if (result == 0) {
            System.out.println("No user" + " " + name + " " + "found" );
        }
        else {
            System.out.println("Total" + " " + result + " " + "user(s) " + name + " " + "found" );
        }
    }

}
