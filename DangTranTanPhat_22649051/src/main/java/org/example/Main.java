package org.example;

import org.example.factorymethod.Notification;
import org.example.factorymethod.NotificationFactory;
import org.example.factorymethod.NotificationFactoryProvider;
import org.example.singleton.AppConfig;

public class Main {
    public static void main(String[] args) {
        demoSingleton();
        System.out.println();
        demoFactoryMethod();
    }

    private static void demoSingleton() {
        System.out.println("=== Singleton Pattern ===");

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setAppName("KTTKPM Demo App");

        System.out.println("config1 app name: " + config1.getAppName());
        System.out.println("config2 app name: " + config2.getAppName());
        System.out.println("Same instance: " + (config1 == config2));
    }

    private static void demoFactoryMethod() {
        System.out.println("=== Factory Method Pattern ===");

        NotificationFactory emailFactory = NotificationFactoryProvider.create("email");
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.send("Chao mung ban den voi Factory Method");

        NotificationFactory smsFactory = NotificationFactoryProvider.create("sms");
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.send("Day la ban tin SMS mau");
    }
}