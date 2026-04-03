package lsp.incorrect;

public class Penguin implements Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin can't 'fly'");
    }

    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }

}
