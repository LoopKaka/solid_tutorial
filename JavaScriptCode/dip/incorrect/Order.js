const EmailNotification = require("./EmailNotification");

class Order {
    constructor() {
        this.emailNotification = new EmailNotification();
    }

    orderPlaced() {
        // Send notification
        this.emailNotification.sendNotification("Order placed");
    }
}

module.exports = Order;
