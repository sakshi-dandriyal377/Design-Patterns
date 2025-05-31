package behavioral.strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {

        //using constructor
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.pay(500);

        PaymentContext paymentContext1 = new PaymentContext(new UpiPayment());
        paymentContext1.pay(100);

        PaymentContext paymentContext2 = new PaymentContext(new CashPayment());
        paymentContext2.pay(300);
    }
}
