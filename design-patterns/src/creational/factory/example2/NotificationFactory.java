package creational.factory.example2;

//✅ This is the Factory Pattern in action.
//We're hiding new object creation inside the factory logic.
public class NotificationFactory {
    public static NotificationService getNotificationService(String channel) {
        if (channel == null) throw new IllegalArgumentException("Channel cannot be null");

        return switch (channel.toLowerCase()) {
            case "email" -> new EmailNotificationService();
            case "sms" -> new SmsNotificationService();
            case "push" -> new PushNotificationService();
            default -> throw new IllegalArgumentException("Unknown notification channel: " + channel);
        };
    }
}
