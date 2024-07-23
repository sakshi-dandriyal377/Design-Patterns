package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {

        //clients want phone from phone store
        Phone phone = PhoneStore.getPhone("Apple","iphone14");
        phone.getDescription();
        System.out.println("---------");

        Phone phone1 = PhoneStore.getPhone("MI","MI A1");
        phone1.getDescription();
        System.out.println("---------");

        Phone phone2 = PhoneStore.getPhone("Samsung","s21");
        phone2.getDescription();
        System.out.println("---------");

        Phone phone3 = PhoneStore.getPhone("OnePlus","onePlus8");
        phone3.getDescription();
        System.out.println("---------");
    }
}
