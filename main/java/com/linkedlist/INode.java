package com.linkedlist;

public interface INode<k>{

    k getKey();
    void setKey(k key);

    INode getNext();
    void setKey(INode next);

    void setNext(INode tempNode);
}
