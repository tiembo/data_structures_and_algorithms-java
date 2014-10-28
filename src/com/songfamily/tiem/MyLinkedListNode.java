package com.songfamily.tiem;

public class MyLinkedListNode {
    private String payload;
    private MyLinkedListNode nextNode = null;

    public MyLinkedListNode(String s) {
        this.payload = s;
    }

    public String getPayload() {
        return payload;
    }

    public void setNextNode(MyLinkedListNode n) {
        this.nextNode = n;
    }

    public MyLinkedListNode getNextNode() {
        return nextNode;
    }
}
