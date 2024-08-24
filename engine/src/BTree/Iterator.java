package BTree;

import java.util.ArrayList;

public interface Iterator {

    public ArrayList<BTreeLeafNode> open();
    public BTreeLeafNode getNext(ArrayList<BTreeLeafNode> arr);
    public void close();
}
