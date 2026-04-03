from FlyingBird import FlyingBird
from WalkingBird import WalkingBird


class Crow(FlyingBird, WalkingBird):
    def fly(self):
        print("Crow is flying")

    def walk(self):
        print("Crow is wlaking")
