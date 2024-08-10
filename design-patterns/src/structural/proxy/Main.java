package structural.proxy;

public class Main {

    public static void main(String[] args) {
        OfficeInternetAccess internetAccess = new ProxyInternetAccess("Sakshi");
        internetAccess.grantInternetAccess();

        OfficeInternetAccess internetAccess1 = new ProxyInternetAccess("hema");
        internetAccess1.grantInternetAccess();
    }
}
