package linkedlists;

import java.util.List;

public class SinglyLinkedList<T> {
    private T val;
    private SinglyLinkedList<T> nextNode;

    public SinglyLinkedList(T val) {
        this.val = val;
    }

    public SinglyLinkedList() {

    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public boolean hasNext() {
        return nextNode != null;
    }

    public SinglyLinkedList next() {
        return nextNode;
    }

    public void setNext(SinglyLinkedList next) {
        nextNode = next;
    }

    public SinglyLinkedList addAll(List<T> elements) {
        var head = this;
        var pointer = head;

        pointer.setVal(elements.get(0));
        for (int i = 1; i < elements.size(); i++) {
            pointer.setNext(new SinglyLinkedList(elements.get(i)));
            pointer = pointer.next();
        }

        return head;
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");

        var pointer = this;

        stringBuilder.append(pointer.getVal());

        while (pointer.hasNext()) {
            pointer = pointer.next();
            stringBuilder.append(", ");
            stringBuilder.append(pointer.getVal());

        }

        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}