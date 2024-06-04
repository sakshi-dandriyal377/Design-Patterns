package creational.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    public StaticBlockSingleton() {
    }

    static {
        try{
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public void display(){
        System.out.println("method of StaticBlockSingleton class");
    }

    public static void main(String[] args) {

        StaticBlockSingleton obj = StaticBlockSingleton.getInstance();
        obj.display();
    }
}
