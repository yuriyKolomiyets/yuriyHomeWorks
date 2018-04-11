package patterns.decorator.beverages;

import patterns.decorator.beverages.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Darkroast";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
