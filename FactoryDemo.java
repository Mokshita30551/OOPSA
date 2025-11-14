package co1n2;

interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    public void notifyUser() { System.out.println("Sending SMS Notification"); }
}

class EmailNotification implements Notification {
    public void notifyUser() { System.out.println("Sending Email Notification"); }
}

class PushNotification implements Notification {
    public void notifyUser() { System.out.println("Sending Push Notification"); }
}

class NotificationFactory {
    public static Notification getNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) return new SMSNotification();
        if (type.equalsIgnoreCase("Email")) return new EmailNotification();
        if (type.equalsIgnoreCase("Push")) return new PushNotification();
        return null;
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Notification n = NotificationFactory.getNotification("Email");
        n.notifyUser();
    }
}

