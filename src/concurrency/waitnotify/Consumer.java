package concurrency.waitnotify;

public class Consumer implements Runnable {

    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            queue.getValue();
        }
    }
}
