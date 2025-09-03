package java_advanced_01.day16.listEx;

public class Node<T> {
    T data;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}
