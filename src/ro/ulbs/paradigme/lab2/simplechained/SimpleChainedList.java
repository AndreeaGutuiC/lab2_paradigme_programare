package ro.ulbs.paradigme.lab2.simplechained;

import ro.ulbs.paradigme.lab2.INode;

import java.util.NoSuchElementException;

public  class SimpleChainedList implements INode {
    private SimpleChainedNode headNode;
    private SimpleChainedNode tailNode;
    private int size;
    private int modCount;

    public SimpleChainedList() {
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
        this.modCount = 0;
    }

    public void addValue( int value){

    }

    public void removeNodeByValue(int value) {
        if (headNode == null) {
            throw new IllegalStateException("Lista este goala.");
        }

        SimpleChainedNode currentNode = headNode;
        SimpleChainedNode previousNode = null;

        while (currentNode != null) {
            if ((int)(currentNode.getValue()) == value) {
                if (previousNode == null) {
                    headNode = currentNode.getNextNode();
                } else {
                    previousNode.setNextNode(currentNode.getNextNode());
                }

                if (currentNode == tailNode) {
                    tailNode = previousNode;
                }

                size--;
                modCount++;
                return;
            }

            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        throw new NoSuchElementException("Valoarea nu a fost gasita in lista.");
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public void setValue(int val) {

    }

    @Override
    public void setNextNode(SimpleChainedNode n) {

    }

    @Override
    public SimpleChainedNode getNextNode() {
        return null;
    }
}
