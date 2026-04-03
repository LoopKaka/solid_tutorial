from IWorker import IWorker


class Robot(IWorker):
    def work(self):
        print("Robot is working")

    def feed(self):
        raise NotImplementedError("Unimplemented method 'feed'")
