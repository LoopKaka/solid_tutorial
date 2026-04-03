class Order {
    constructor(notification) {
        this.notification = notification;
    }

    orderPlaced() {
        // Send notification
        this.notification.sendNotification("Order placed");
    }
}

module.exports = Order;
