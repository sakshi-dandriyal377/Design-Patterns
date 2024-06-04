package creational.singleton;

public class BillPughSingleton {

    public BillPughSingleton() {
    }

    //private inner static helper class
    private static class  SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public void display(){
        System.out.println("method of BillPughSingleton class");
    }

    public static void main(String[] args) {

        BillPughSingleton obj = BillPughSingleton.getInstance();
        obj.display();
    }
}
