package week3.Cyrcus.Roles;

public class Clown extends Artist {

   /* private int noseWeight;*/

    public Clown(){
    }

    public Clown(/*int noseWeight, */String name, double availableMoney, int countOfPlay, int countOfDrinks) {
        super(name, availableMoney, countOfPlay, countOfDrinks);
       // this.noseWeight = noseWeight;
    }

    @Override
    public void play() {
        System.out.println("clown works");
        this.setCountOfPlay(getCountOfPlay() + 1);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(100);
    }

   /* public int getNoseWeight() {
        return noseWeight;
    }

    public void setNoseWeight(int noseWeight) {
        this.noseWeight = noseWeight;
    }*/
}
