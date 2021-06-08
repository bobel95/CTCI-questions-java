package linkedlists.Q2_03_Delete_Middle_Node;

import linkedlists.SinglyLinkedList;

// Implement an algorithm to delete a node in the middle
// (i.e., any node but the first and last node, not necessarily the exact middle)
// of a singly linked list, given only access to that node.
// EXAMPLE
// Input:the node c from the linked list a->b->c->d->e->f
// Result: nothing is returned, but the new linked list looks like a->b->d->e->f
public class DeleteMiddleNode {

    public void deleteMiddleNode(SinglyLinkedList node) {
        if (node == null || node.next() == null) {
            return;
        }

        SinglyLinkedList next = node.next();
        node.setVal(next.getVal());
        node.setNext(next.next());
    }
}
