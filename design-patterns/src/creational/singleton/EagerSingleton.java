package creational.singleton;


public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        if(instance != null){
            throw new IllegalStateException("instance already created");
        }
    }

    public static EagerSingleton getInstance(){
        return instance;
    }

    public void display(){
        System.out.println("method of eager singleton class");
    }

    public static void main(String[] args) {

        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.display();
    }
}
