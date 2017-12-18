package week3.circus.roles;

public class Acrobat extends Artist  {

    public Acrobat(String name, double availableMoney, int countOfPlay, int countOfDrinks) {
        super(name, availableMoney, countOfPlay, countOfDrinks);
        this.setSalary(300);
    }


    @Override
    public void play(){
        System.out.println("acrobat works");
        this.setCountOfPlay(getCountOfPlay() + 1);
    }

}
