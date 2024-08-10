package structural.facade;

public class Client {

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        // Placing an order
        String itemId = "12345";
        String paymentDetails = "CreditCard";

        orderFacade.placeOrder(itemId, paymentDetails);
    }
}

