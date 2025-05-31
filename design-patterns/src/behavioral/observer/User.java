package behavioral.observer;

public class User implements Subscriber {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void notify(String channelName, String latestVideo) {
        System.out.println(username + " received notification: New video '" + latestVideo + "' on channel '" + channelName + "'");
    }
}

