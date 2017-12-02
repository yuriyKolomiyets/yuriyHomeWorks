package phoneBook;

public class Phonebook {

    private int countOfFriends;
    private Friend[] friends;

    public Phonebook(int countOfFriends, Friend[] friends) {
        this.countOfFriends = countOfFriends;
        this.friends = friends;
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
}
