package isp.correct;

public class SuperWorker implements IWork, IFeed {
    @Override
    public void work() {
        System.out.println("SuperWorker is working");
    }

    @Override
    public void feed() {
        System.out.println("SuperWorker is having food");
    }
}
