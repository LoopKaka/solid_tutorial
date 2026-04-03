from IFeed import IFeed
from IWork import IWork


class SuperWorker(IWork, IFeed):
    def work(self):
        print("SuperWorker is working")

    def feed(self):
        print("SuperWorker is having food")
