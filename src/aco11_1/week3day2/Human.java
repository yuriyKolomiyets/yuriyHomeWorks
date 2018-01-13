package aco11_1.week3day2;

public class Human {
    private String name;
    private int availableMoney;

    public Human() {
    }

    public Human(String name, int availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", availableMoney=" + availableMoney;
    }
}
