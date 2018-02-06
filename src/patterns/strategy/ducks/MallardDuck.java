package patterns.strategy.ducks;

import patterns.strategy.fly.FlyWithWings;
import patterns.strategy.quck.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

   /* @Override
    public void performFLy() {
    }*/

    public void display(){
        System.out.println("I;m real Mallard duck");
    }
}
