from IWorker import IWorker


class Worker(IWorker):
    def work(self):
        print("Worker is working")

    def feed(self):
        print("Worker is having food")
