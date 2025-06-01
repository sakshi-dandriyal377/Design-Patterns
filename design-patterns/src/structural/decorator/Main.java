package structural.decorator;

public class Main {

    public static void main(String[] args) {
        // We got pizza with different topings , we can keep adding topings
        Pizza pizza = new PeppyPaneer(new ExtraCheese(new PlainPizza()));

        System.out.println(pizza.getDescription()+"="+pizza.getCost());

        Pizza pizza1 = new PlainPizza();
        pizza1 = new ExtraCheese(pizza1);
        //pizza1 = new PeppyPaneer(pizza1);

        System.out.println(pizza1.getDescription()+"="+pizza1.getCost());

    }
}
