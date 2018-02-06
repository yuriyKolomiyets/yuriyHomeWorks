package patterns.strategy;

import patterns.strategy.ducks.Duck;
import patterns.strategy.ducks.MallardDuck;
import patterns.strategy.ducks.ModelDuck;
import patterns.strategy.fly.FlyRocketPowered;
import patterns.strategy.quck.MuteQuack;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFLy();

        System.out.println("23");

        Duck model = new ModelDuck();
        model.performFLy();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFLy();
        model.setQuackBehavior(new MuteQuack());
        model.performQuack();
        model.swim();


    }
}
