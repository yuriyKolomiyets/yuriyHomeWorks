package week3.Cyrcus;

public class TightropeWalker extends Artist {

    public TightropeWalker(String name, double availableMoney, int countOfPlay, int countOfDrinks) {
        super(name, availableMoney, countOfPlay, countOfDrinks);
    }

    @Override
    void play() {
        System.out.println("TW works");
        this.setCountOfPlay(getCountOfPlay() + 1);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(500);
    }
}
