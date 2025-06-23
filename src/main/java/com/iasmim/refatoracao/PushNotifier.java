package com.iasmim.refatoracao;

public class PushNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}
