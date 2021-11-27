package concurrency.join;

public class JoinMain {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1 wrote: " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 2 wrote: " + i);
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
