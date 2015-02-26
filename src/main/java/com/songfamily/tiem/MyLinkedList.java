package com.songfamily.tiem;

public class MyLinkedList {
    private MyLinkedListNode rootNode;

    public MyLinkedList() {
        rootNode = null;
    }

    public void add(String s) {
        MyLinkedListNode newNode = new MyLinkedListNode(s);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            MyLinkedListNode current = rootNode;

            // find last node
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }

            current.setNextNode(newNode);
        }
    }

    public void reverse() {

        // don't process if list has 0 or 1 element
        if (rootNode != null && rootNode.getNextNode() != null) {
            MyLinkedListNode nextNode = rootNode.getNextNode();
            MyLinkedListNode nextNextNode = nextNode.getNextNode();

            rootNode.setNextNode(null);
            nextNode.setNextNode(rootNode);

            // two element linked list
            if (nextNextNode == null) {
                rootNode = nextNode;
                return;
            }

            MyLinkedListNode previous = nextNode;
            MyLinkedListNode current = nextNextNode;

            while (current != null) {
                nextNode = current.getNextNode();
                current.setNextNode(previous);

                previous = current;
                current = nextNode;
            }

            rootNode = previous;
        }
    }

    public void reverse2() {
        if (rootNode == null)
            return;

        MyLinkedListNode previous = null;
        MyLinkedListNode current = rootNode;

        do {
            MyLinkedListNode next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = next;
        } while (current != null);

        rootNode = previous;
    }

    public String toString() {
        if (rootNode == null)
            return null;

        String s = "";
        MyLinkedListNode current = rootNode;

        do {
            s += current.getPayload();
            current = current.getNextNode();
        } while (current != null);

        return s;
    }
}
