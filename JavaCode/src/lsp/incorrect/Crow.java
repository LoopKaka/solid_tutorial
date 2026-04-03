package lsp.incorrect;

public class Crow implements Bird {

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public void walk() {
        System.out.println("Crow is wlaking");
    }

}
