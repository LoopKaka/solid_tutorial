package lsp.correct;

public class Crow implements FlyingBird, WalkingBird {

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public void walk() {
        System.out.println("Crow is wlaking");
    }

}
