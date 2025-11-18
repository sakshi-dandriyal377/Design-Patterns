package creational.factory.example2;

public class NotificationClient {
    public static void main(String[] args) {
        String channel = "email";

        NotificationService notificationService = NotificationFactory.getNotificationService(channel);
        notificationService.sendNotification("You have a new email!");

    }
}
