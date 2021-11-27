package concurrency.waitnotify;

public class Producer implements Runnable {

    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            queue.setValue(i);
        }
    }
}
