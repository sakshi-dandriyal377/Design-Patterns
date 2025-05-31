package behavioral.observer;

public interface YouTube {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers();
}
