package concurrency.waitnotify;

public class Queue {

    private int value;
    private boolean setValue = false;

    public synchronized int getValue() {
        while (!setValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setValue = false;
        System.out.println("Got value: " + this.value);
        notify();
        return value;
    }

    public synchronized void setValue(int value) {
        while (setValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        this.setValue = true;
        System.out.println("Put value: " + this.value);
        notify();
    }

}
