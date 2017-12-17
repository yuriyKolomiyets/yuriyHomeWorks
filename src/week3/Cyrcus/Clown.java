package week3.Cyrcus;

public class Clown extends Artist {

    private int noseWeight;

    public Clown(){
    }

    public Clown(String name, double availableMoney, int countOfPlay, int countOfDrinks) {
        super(name, availableMoney, countOfPlay, countOfDrinks);
    }

    @Override
    void play() {
        System.out.println("clown works");
        this.setCountOfPlay(getCountOfPlay() + 1);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(100);
    }

}
