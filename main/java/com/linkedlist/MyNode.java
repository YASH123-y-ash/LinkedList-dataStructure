package com.linkedlist;

public class MyNode<k> implements INode<k> {
    private  k key;
    private MyNode<k> next;

    public MyNode(k key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public k getKey() {
        return key;
    }

    @Override
    public void setKey(k key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    @Override
    public void setKey(INode next) {

    }

    public void setNext(INode next) {
        this.next = (MyNode<k>) next;
    }
}