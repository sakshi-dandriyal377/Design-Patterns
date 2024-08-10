package structural.facade;

public class InventoryService {

    public boolean checkStock(String itemId) {
        System.out.println("Checking stock for item: " + itemId);
        // Simulate stock check
        return true;
    }

    public void reserveItem(String itemId) {
        System.out.println("Reserving item: " + itemId);
    }
}
