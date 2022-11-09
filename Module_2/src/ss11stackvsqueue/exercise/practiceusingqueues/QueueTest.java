package ss11stackvsqueue.exercise.practiceusingqueues;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        Solution<Integer> solution = new Solution<>();

        solution.enQueue(queue, 1);
        solution.enQueue(queue, 2);
        solution.enQueue(queue, 3);

        solution.deQueue(queue);
        solution.deQueue(queue);
//        solution.deQueue(queue);
//        solution.deQueue(queue);


        solution.displayQueue(queue);
    }
}
