const Notification = require("./Notification");

class EmailNotification extends Notification {
    sendNotification(message) {
        console.log(message);
    }
}

module.exports = EmailNotification;
