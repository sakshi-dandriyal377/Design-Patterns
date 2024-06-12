package creational.factory;

public class IPhone15 extends Phone{

    public IPhone15() {
    }

    @Override
    double getPrice() {
        return 80000.00;
    }

    @Override
    String getdescription() {
       return "This is IPhone15";
    }
}
