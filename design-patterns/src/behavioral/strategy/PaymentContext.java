package behavioral.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    //constructor injection
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    //setter injection
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
