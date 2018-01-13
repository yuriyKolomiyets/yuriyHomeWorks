package aco11_1.phoneBook;

public class Friend {
    private int userId;
    private String userName;
    private String userPhoneNumber;
    private int userYearOfBirth;
    private double userWeight;

    public Friend(int userId, String userName, String userPhoneNumber, int userYearOfBirth, double userWeight) {
        this.userId = userId;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userYearOfBirth = userYearOfBirth;
        this.userWeight = userWeight;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public int getUserYearOfBirth() {
        return userYearOfBirth;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void setUserYearOfBirth(int userYearOfBirth) {
        this.userYearOfBirth = userYearOfBirth;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }
}
