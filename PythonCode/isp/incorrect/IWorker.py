from abc import ABC, abstractmethod


class IWorker(ABC):
    @abstractmethod
    def work(self):
        pass

    @abstractmethod
    def feed(self):
        pass
