package myqueue;

public class MyQueue<T> {
    private Node<T> last = null;
    private Node<T> first = null;
    private int size = 0;

    public MyQueue() {

    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrevious(last);
            last = newNode;
        }
        ++size;
    }

    public T poll() {
        Node<T> element = first;
        if (first.getNext() != null) {
            first = first.getNext();
            element.setNext(null);
        } else {
            first = null;
            last = null;
        }
        if (size > 0) {
            --size;
        }
        return element.getValue();
    }

    public Node<T> getLast() {
        return last;
    }

    public Node<T> getFirst() {
        return first;
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        Node<T> current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

}

class Node<T> {
    Node next = null;
    Node previous = null;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
