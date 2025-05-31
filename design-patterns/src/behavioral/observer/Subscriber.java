package behavioral.observer;

public interface Subscriber {
    void notify(String channelName, String latestVideo);

}
