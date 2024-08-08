package Queue;

import LinkedList.Item;
import LinkedList.ItemList;

public class Queue extends ItemList implements IQueue{
    Item front;
    Item rear;

    public Queue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(String data) {
        Item newItem;
        if (isEmpty()) {
            newItem = add(data);
            front = newItem;
            rear = newItem;
        } else {
            newItem = add(data);
            rear = newItem;
        }
        System.out.println(newItem.getData() + " added");
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        String data = front.getData();
        front = front.next;
        if (front == null) { // 마지막 항목
            rear = null;
        }
        return data;
    }

    @Override
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        Item temp = front;
        while (temp != null) {
            System.out.println(temp.getData() + ",");
            temp = temp.next;
        }
        System.out.println();
    }
}
