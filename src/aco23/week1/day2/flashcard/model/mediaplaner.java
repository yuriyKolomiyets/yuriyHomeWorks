package aco23.week1.day2.flashcard.model;

public class mediaplaner {
    private String name;
    private int salry;

    public mediaplaner(String name, int salry) {
        this.name = name;
        this.salry = salry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalry() {
        return salry;
    }

    public void setSalry(int salry) {
        this.salry = salry;
    }
}
