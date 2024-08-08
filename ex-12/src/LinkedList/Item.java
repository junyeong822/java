package LinkedList;

// 노드 = 아이템

public class Item {

    private String data; // 자료
    public Item next; // 다음 아이템의 주소값을 저장(링크)
    public Item() {
        data = null;
        next = null;
    }

    public Item(String data) {
        this.data = data;
        next = null;
    }

    public Item(String data, Item next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

}
