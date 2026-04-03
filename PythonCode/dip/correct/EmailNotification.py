from Notification import Notification


class EmailNotification(Notification):
    def send_notification(self, message):
        print(message)
