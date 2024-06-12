package creational.factory;

public class Client {
    public static void main(String[] args) {
        Phone iphone14 = AppleStore.getPhone("IPhone14");
        System.out.println(iphone14.getdescription());
        System.out.println(iphone14.getPrice());
        System.out.println();

        Phone iphone15 = AppleStore.getPhone("IPhone15");
        System.out.println(iphone15.getdescription());
        System.out.println(iphone15.getPrice());
        System.out.println();
    }
}
