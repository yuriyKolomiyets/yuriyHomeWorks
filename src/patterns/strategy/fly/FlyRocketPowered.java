package patterns.strategy.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Im flying with a rocket");
    }
}
