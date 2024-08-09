package Queue;

public class Test {

    public static void main(String[] args) {
        Queue listQueue = new Queue();
        listQueue.enQueue("A");
        listQueue.enQueue("B");
        listQueue.enQueue("C");
        listQueue.enQueue("D");
        listQueue.enQueue("E");

        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        listQueue.printAll();

    }
}
