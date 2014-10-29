package com.songfamily.tiem;

public class MyLinkedList {
    private MyLinkedListNode rootNode;

    public MyLinkedList() {
        this.rootNode = null;
    }

    public void add(String s) {
        MyLinkedListNode newNode = new MyLinkedListNode(s);
        if (rootNode == null) {
            this.rootNode = newNode;
        } else {
            MyLinkedListNode current = rootNode;

            // find last node
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }

            current.setNextNode(newNode);
        }
    }

    public String toString() {
        if (rootNode == null) {
            return null;
        } else {
            String s = "";
            MyLinkedListNode current = rootNode;

            do {
              s += current.getPayload();
              current = current.getNextNode();
            } while (current != null);

            return s;
        }
    }
}
