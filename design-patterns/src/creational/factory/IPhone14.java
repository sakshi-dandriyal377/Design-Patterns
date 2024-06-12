package creational.factory;

public class IPhone14 extends Phone{

    public IPhone14() {
    }

    @Override
    double getPrice() {
        return 55000.00;
    }

    @Override
    String getdescription() {
        return "This is IPhone14";
    }
}
