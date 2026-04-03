package isp.incorrect;

public class Worker implements IWorker {

    @Override
    public void work() {
        System.out.println("Worker is working");
    }

    @Override
    public void feed() {
        System.out.println("Worker is having food");
    }

}
