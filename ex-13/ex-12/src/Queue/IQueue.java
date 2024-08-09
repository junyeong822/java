package Queue;

import LinkedList.Item;
import LinkedList.ItemList;

public interface IQueue {

    public void enQueue(String data); // add, push
    public String deQueue(); // remove, pop
    public void printAll();

}
