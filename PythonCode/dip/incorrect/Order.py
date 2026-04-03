from EmailNotification import EmailNotification


class Order:
    def __init__(self):
        self.email_notification = EmailNotification()

    def order_placed(self):
        # Send notification
        self.email_notification.send_notification("Order placed")
