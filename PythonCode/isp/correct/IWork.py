from abc import ABC, abstractmethod


class IWork(ABC):
    @abstractmethod
    def work(self):
        pass
