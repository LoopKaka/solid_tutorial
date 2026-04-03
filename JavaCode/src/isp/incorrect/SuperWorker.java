package isp.incorrect;

public class SuperWorker implements IWorker {
    @Override
    public void work() {
        System.out.println("SuperWorker is working");
    }

    @Override
    public void feed() {
        System.out.println("SuperWorker is having food");
    }
}
