package ss11stackvsqueue.exercise.practiceusingqueues;

public class Solution<T> {
    Queue<T> queue;

    public Solution() {
        queue = new Queue<T>();
    }

    public void enQueue(Queue q, T value) {
        Node newNode = new Node(value);

        if (q.getFront() == null) {
            q.setFront(newNode);
            q.setRear(newNode);
        } else {
            Node temp = q.getFront();
            while (temp.getLink() != null && temp.getLink() != q.getFront()) {
                temp = temp.getLink();
            }
            q.setRear(newNode);
            temp.setLink(q.getRear());

            q.getRear().setLink(q.getFront());
        }
    }

    public void deQueue(Queue q) {
        if (q.getFront() == null) {
            System.out.println("The queue is empty!");
        } else if (q.getFront() == q.getRear()) {
            q.setFront(null);
            q.setRear(null);
        } else {
            q.setFront(q.getFront().getLink());
            q.getRear().setLink(q.getFront());
        }
    }


    public void displayQueue(Queue q) {
        Node temp = q.getFront();

        if (q.getFront() == null) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        }
    }
}
