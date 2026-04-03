from FlyingBird import FlyingBird
from WalkingBird import WalkingBird


class Parrot(FlyingBird, WalkingBird):
    def fly(self):
        print("Parrot is flying")

    def walk(self):
        print("Parrot is walking")
