package lsp.correct;

public class Parrot implements FlyingBird, WalkingBird {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void walk() {
        System.out.println("Parrot is walking");
    }
}
