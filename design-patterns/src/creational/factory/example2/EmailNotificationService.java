package creational.factory.example2;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("📧 Sending EMAIL notification: " + message);
    }
}
