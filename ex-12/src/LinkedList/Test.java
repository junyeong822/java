package LinkedList;

public class Test {
    public static void main(String[] args) {
        ItemList list = new ItemList();

        list.add("A");
        list.add("B");
        list.add("C");

        list.printAll();

        list.insert(2,"D");
        list.printAll();

        list.remove(0);
        list.remove(1);
        list.printAll();
        System.out.println(list.size());

        list.insert(0,"A-1");
        list.printAll();
        System.out.println(list.size());

        list.removeAll();
        list.printAll();
        list.add("A");
        list.printAll();
    }
}
