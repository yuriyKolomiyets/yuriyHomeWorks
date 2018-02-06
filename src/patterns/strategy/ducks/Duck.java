package patterns.strategy.ducks;

import patterns.strategy.fly.FlyBehavior;
import patterns.strategy.quck.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performQuack() {
        quackBehavior.quack();

    }

    public void performFLy(){

        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks swim");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
