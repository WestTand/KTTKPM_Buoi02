package org.example.factorymethod;

public final class NotificationFactoryProvider {
    private NotificationFactoryProvider() {
    }

    public static NotificationFactory create(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Loai notification khong duoc null");
        }

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotificationFactory();
            case "sms" -> new SmsNotificationFactory();
            default -> throw new IllegalArgumentException("Loai notification khong ho tro: " + type);
        };
    }
}