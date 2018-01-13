package aco23.week1.day1.Passendgers;

public class User {

    private int userId;
    private String userName;
    private Passport passport;

    public User(int userId, String userName, Passport passport) {
        this.userId = userId;
        this.userName = userName;
        this.passport = passport;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
