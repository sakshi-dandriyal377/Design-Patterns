package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements YouTube{

    private String name;
    private String latestVideo;
    private List<Subscriber> subscribers = new ArrayList<>();

    public YouTubeChannel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    /*
    The set method (e.g., setVideo(...)) is used to update the internal state of the subject (like uploading a new video)
     and trigger notifications to all observers when that state changes.
    */
    public void setVideo(String latestVideo) {
        this.latestVideo = latestVideo;
        System.out.println("[" + name + "] uploaded a new video: " + latestVideo);
        notifySubscribers(); //calling line 37
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(name, latestVideo);
        }
    }

}






