package behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel("design pattern");

        Subscriber user = new User("Marry");
        Subscriber user1 = new User("Alex");

        youTubeChannel.subscribe(user);
        youTubeChannel.subscribe(user1);

        youTubeChannel.setVideo("observer design pattern");

        youTubeChannel.unsubscribe(user1);

        youTubeChannel.setVideo("strategy pattern");



    }
}
