from abc import ABC, abstractmethod


class IFeed(ABC):
    @abstractmethod
    def feed(self):
        pass
