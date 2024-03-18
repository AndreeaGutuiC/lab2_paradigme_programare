package ro.ulbs.paradigme.lab2;

import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedNode;

public interface INode {

        int getValue();
        void setValue(int val);
        public void setNextNode(SimpleChainedNode n);
        public SimpleChainedNode getNextNode();

}
