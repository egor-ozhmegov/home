package concurrency;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Simple thread");
        super.run();
    }
}
