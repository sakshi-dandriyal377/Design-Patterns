package structural.decorator;

public class PeppyPaneer extends PizzaDecorator {


    public PeppyPaneer(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+"PeppyPaneer";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+200;
    }
}
