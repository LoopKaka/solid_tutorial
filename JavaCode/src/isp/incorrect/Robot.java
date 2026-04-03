package isp.incorrect;

public class Robot implements IWorker {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void feed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'feed'");
    }

}
