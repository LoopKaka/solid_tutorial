from IFeed import IFeed
from IWork import IWork


class Worker(IWork, IFeed):
    def work(self):
        print("Worker is working")

    def feed(self):
        print("Worker is having food")
