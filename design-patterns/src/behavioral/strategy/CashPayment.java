package behavioral.strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid rs" + amount + " using Cash");
    }
}
