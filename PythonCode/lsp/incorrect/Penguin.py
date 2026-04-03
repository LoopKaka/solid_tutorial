from Bird import Bird


class Penguin(Bird):
    def fly(self):
        raise NotImplementedError("Penguin can't 'fly'")

    def walk(self):
        print("Penguin is walking")
