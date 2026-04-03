package dip.correct;

public class Order {

    private Notification notification;

    public Order(Notification notification) {
        this.notification = notification;
    }

    void orderPlaced() {
        // Send notification
        this.notification.sendNotification("Order placed");
    }

}
