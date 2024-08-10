package structural.decorator;

public class ExtraCheese extends PizzaDecorator{

    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with extracheese ";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}
