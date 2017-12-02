package phoneBook;

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

        for (int i = 0; i < friends.length; i++) {
            if (friends[i].getUserName().equals(name)) {
                System.out.println("User Found: " +
                        friends[i].getUserId() + ", " + friends[i].getUserName() + ", " +
                        friends[i].getUserPhoneNumber() + ", " + friends[i].getUserYearOfBirth() + ", " +
                        friends[i].getUserWeight()
                );
            }
        }
    }

}
