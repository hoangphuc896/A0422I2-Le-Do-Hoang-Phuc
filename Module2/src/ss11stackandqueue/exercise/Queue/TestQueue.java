package ss11stackandqueue.exercise.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Solution queue = new Solution();

        queue.enQueue(32);
        queue.enQueue(42);
        queue.enQueue(24);
        queue.enQueue(55);
        queue.enQueue(30);
        queue.enQueue(21);

        queue.displayQueue();
        System.out.println("\n delete");
        queue.deQueue();
        queue.displayQueue();

        System.out.println("\n delete");
        queue.deQueue();
        queue.displayQueue();
    }
}
