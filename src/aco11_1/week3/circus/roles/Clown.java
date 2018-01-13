package aco11_1.week3.circus.roles;

public class Clown extends Artist {

   /* private int noseWeight;*/

    public Clown(){
    }

    public Clown(/*int noseWeight, */String name, double availableMoney, int countOfPlay, int countOfDrinks) {
        super(name, availableMoney, countOfPlay, countOfDrinks);
        this.setSalary(100);
       // this.noseWeight = noseWeight;
    }

    @Override
    public void play() {
        System.out.println("clown works");
        this.setCountOfPlay(getCountOfPlay() + 1);
    }


   /* public int getNoseWeight() {
        return noseWeight;
    }

    public void setNoseWeight(int noseWeight) {
        this.noseWeight = noseWeight;
    }*/
}
