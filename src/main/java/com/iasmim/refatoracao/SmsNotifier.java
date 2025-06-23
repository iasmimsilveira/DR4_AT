package com.iasmim.refatoracao;

public class SmsNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
