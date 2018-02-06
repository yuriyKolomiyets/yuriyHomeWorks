package patterns.strategy.ducks;

import patterns.strategy.fly.FlyNoWay;
import patterns.strategy.quck.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
     flyBehavior = new FlyNoWay();
     quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("Im a model duck");
    }


}
