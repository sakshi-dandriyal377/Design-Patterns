package creational.factory.example2;

public class SmsNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("📱 Sending SMS notification: " + message);
    }
}
