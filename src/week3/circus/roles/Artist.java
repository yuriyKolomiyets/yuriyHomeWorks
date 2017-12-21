package week3.circus.roles;

public class Artist implements ArtistPlay, Comparable<Artist> {
    private String name;
    private double availableMoney;
    private double salary;
    private int countOfPlay;
    private int countOfDrinks;

    public Artist() {
    }

    public Artist(String name, double availableMoney, int countOfPlay, int countOfDrinks) {
        this.name = name;
        this.availableMoney = availableMoney;
        this.countOfPlay = countOfPlay;
        this.countOfDrinks = countOfDrinks;
    }

    public void paySalary() {
        availableMoney = availableMoney + salary;
    }

    public void drink(int numOfDrink) {
        countOfDrinks = countOfDrinks + numOfDrink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCountOfPlay() {
        return countOfPlay;
    }

    public void setCountOfPlay(int countOfPlay) {
        this.countOfPlay = countOfPlay;
    }

    public int getCountOfDrinks() {
        return countOfDrinks;
    }

    public void setCountOfDrinks(int countOfDrinks) {
        this.countOfDrinks = countOfDrinks;
    }

    @Override
    public void play() {

    }

    @Override
    public int compareTo(Artist o) {
        return this.getName().compareTo(o.getName());
    }
}
