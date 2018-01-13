package aco11_1.week04.node;

public class Node {

    public Object value;
    public Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
