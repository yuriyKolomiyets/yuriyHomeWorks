package aco11_1.week3.circus.roles;

public class TightropeWalker extends Artist {

    public TightropeWalker(String name, double availableMoney, int countOfPlay, int countOfDrinks) {
        super(name, availableMoney, countOfPlay, countOfDrinks);
        this.setSalary(400);
    }

    @Override
    public void play() {
        System.out.println("TW works");
        this.setCountOfPlay(getCountOfPlay() + 1);
    }

}
