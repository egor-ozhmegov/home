package concurrency.waitnotify;

public class WaitNotifyMain {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread reader = new Thread(consumer);
        Thread writer = new Thread(producer);

        reader.start();
        writer.start();


    }
}
