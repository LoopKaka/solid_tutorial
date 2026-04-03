class Order:
    def __init__(self, notification):
        self.notification = notification

    def order_placed(self):
        # Send notification
        self.notification.send_notification("Order placed")
