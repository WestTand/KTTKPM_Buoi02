package org.example.factorymethod;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[SMS] Gui thong diep: " + message);
    }
}