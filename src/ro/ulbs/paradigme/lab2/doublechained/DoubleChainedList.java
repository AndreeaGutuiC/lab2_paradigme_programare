package ro.ulbs.paradigme.lab2.doublechained;

public class DoubleChainedList {
    private DoubleChainedNode headNode;
    private DoubleChainedNode tailNode;
    private int size;
    private int modCount;

    public DoubleChainedList() {
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }
}
