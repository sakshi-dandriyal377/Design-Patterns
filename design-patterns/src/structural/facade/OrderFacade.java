package structural.facade;

public class OrderFacade {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String itemId, String paymentDetails) {
        if (inventoryService.checkStock(itemId)) {
            inventoryService.reserveItem(itemId);
            if (paymentService.processPayment(paymentDetails)) {
                shippingService.arrangeShipping(itemId);
                System.out.println("Order placed successfully for item: " + itemId);
            } else {
                System.out.println("Payment failed for item: " + itemId);
            }
        } else {
            System.out.println("Item out of stock: " + itemId);
        }
    }
}

