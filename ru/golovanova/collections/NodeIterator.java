package ru.golovanova.collections;

import java.util.Iterator;

public class NodeIterator<E> implements Iterator<E> {
    private Node<E> node;

    public NodeIterator(Node<E> node) {
        this.node = node;
    }

    public Node<E> getNode() {
        return node;
    }

    public void setNode(Node<E> node) {
        this.node = node;
    }

    public boolean hasNext() {
        return node != null;
    }

    public E next() {
        E element = node.getElement();
        node = node.getNextNode();
        return element;
    }

    public Node<E> nextNode() {
        Node<E> next = node;
        node = node.getNextNode();
        return next;
    }
}


