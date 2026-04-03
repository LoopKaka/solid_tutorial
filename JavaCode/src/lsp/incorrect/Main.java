package lsp.incorrect;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.fly();
        bird.walk();
    }
}
