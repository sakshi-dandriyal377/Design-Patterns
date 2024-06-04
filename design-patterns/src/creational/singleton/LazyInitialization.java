package creational.singleton;

public class LazyInitialization {

    private static LazyInitialization instance = null ;

    public LazyInitialization() {
    }

    //way 1
    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }

    //thread safe
    public static LazyInitialization getInstance1(){
        if(instance == null){
            synchronized (LazyInitialization.class){
                instance = new LazyInitialization();
            }
        }
        return instance;
    }

    // double checked locking
    public static LazyInitialization getInstance2(){
        if(instance == null){
            synchronized (LazyInitialization.class){
                if(instance == null)
                    instance = new LazyInitialization();
            }
        }
        return instance;
    }


    public void display(){
        System.out.println("method of LazyInitialization class");
    }

    public static void main(String[] args) {

        LazyInitialization obj = LazyInitialization.getInstance();
        obj.display();
    }
}
