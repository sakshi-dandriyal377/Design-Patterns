package creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void display(){
        System.out.println("method of EnumSingleton class");
    }

    public static void main(String[] args) {
        EnumSingleton obj = EnumSingleton.INSTANCE;
        obj.display();
    }
}
