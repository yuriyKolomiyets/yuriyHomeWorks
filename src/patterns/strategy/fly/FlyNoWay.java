package patterns.strategy.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {

        System.out.println("I cant fly");
    }
}
