package structural.decorator;

public class Main {

    public static void main(String[] args) {
        // We got pizza with different topings , we can keep adding topings
        Pizza pizza = new PeppyPaneer(new ExtraCheese(new PlainPizza()));

        System.out.println(pizza.getDescription()+"="+pizza.getCost());
    }
}
