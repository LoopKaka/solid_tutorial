from IWorker import IWorker


class SuperWorker(IWorker):
    def work(self):
        print("SuperWorker is working")

    def feed(self):
        print("SuperWorker is having food")
