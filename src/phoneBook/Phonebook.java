package phoneBook;

public class Phonebook {
    private Phonebook[] friends;

    private int countOfFriends;

    public Phonebook(Phonebook[] friends) {
        this.friends = friends;
        countOfFriends = friends.length;
    }

    public int getCountOfFriends() {
        return countOfFriends;
    }

    public void setCountOfFriends(int countOfFriends) {
        this.countOfFriends = countOfFriends;
    }

    public Phonebook[] getFriends() {
        return friends;
    }

    public void setFriends(Phonebook[] friends) {
        this.friends = friends;
    }
}
