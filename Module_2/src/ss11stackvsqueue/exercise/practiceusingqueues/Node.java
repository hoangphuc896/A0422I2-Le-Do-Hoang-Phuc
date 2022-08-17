package ss11stackvsqueue.exercise.practiceusingqueues;

public class Node<T> {
    public T data;
    public Node link;

    public Node(T value) {
        data =value;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
