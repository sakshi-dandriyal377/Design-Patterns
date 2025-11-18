package creational.factory.example2;

public class PushNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("🔔 Sending PUSH notification: " + message);
    }
}
