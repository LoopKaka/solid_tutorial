from abc import ABC, abstractmethod


class WalkingBird(ABC):
    @abstractmethod
    def walk(self):
        pass
