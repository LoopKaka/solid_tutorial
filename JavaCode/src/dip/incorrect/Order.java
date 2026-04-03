package dip.incorrect;

class Order {

    EmailNotification emailNotification = new EmailNotification();

    void orderPlaced() {
        // Send notification
        emailNotification.sendNotification("Order placed");
    }
}
