package isp.correct;

public class Worker implements IWork, IFeed {
    @Override
    public void work() {
        System.out.println("Worker is working");
    }

    @Override
    public void feed() {
        System.out.println("Worker is having food");
    }
}
