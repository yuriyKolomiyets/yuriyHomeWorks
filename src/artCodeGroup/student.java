package artCodeGroup;

public class student {
    private int userId;
    private String name;

    public student(int userId, String name, String surname, String email, int yearOfBirth, double moneyPaid, int countOfTasks) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.moneyPaid = moneyPaid;
        this.countOfTasks = countOfTasks;
    }

    private String surname;
    private String email;
    private int yearOfBirth;
    private double moneyPaid;
    private int countOfTasks;

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getMoneyPaid() {
        return moneyPaid;
    }

    public int getCountOfTasks() {
        return countOfTasks;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setMoneyPaid(double moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public void setCountOfTasks(int countOfTasks) {
        this.countOfTasks = countOfTasks;
    }


}
