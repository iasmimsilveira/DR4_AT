package com.iasmim.refatoracao;

public class NotificationService {
    public void notifyUser(Notifier notifier, String message) {
        notifier.send(message);
    }
}
