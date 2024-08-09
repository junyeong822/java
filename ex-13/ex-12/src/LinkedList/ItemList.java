package LinkedList;

public class ItemList {

    private Item head; // 시작 위치 저장
    int count ; // 총 갯수 저장

    public ItemList(){
        head = null;
        count = 0;
    }

    public Item add(String data){

        Item newItem = null;

        if(head == null){ // 처음 데이터 저장일 때
            newItem = new Item(data);
            head = newItem;
        } else{

            newItem = new Item(data);
            Item temp = head;
            
            while(temp.next != null){ // null을 찾을 때까지 계속 반복
                temp = temp.next;
            }
            // next가 null인 위치를 발견하면
            temp.next = newItem; // 새로 생성된 객체를 저장
        }

        count++;
        return newItem;
    }


    public Item insert(int position, String data){

        Item newItem = new Item(data);
        Item temp = head;

        if(position < 0 || position > count){
            System.out.println("추가 위치 오류");
            System.out.println("현재 리스트 갯수 : " + count);
            return null;
        }

        if(position == 0){
            newItem.next = head;
            head = newItem;
        } else{

            Item prev = null; // 이전 아이템 링크 저장

            for(int i = 0; i < position; i++){
                prev = temp;
                temp = temp.next;
            }

            newItem.next = prev.next;
            prev.next = newItem;

        }
        count ++;
        return newItem;
    }

    public Item remove(int position){

        Item temp = head;

        if(position < 0 || position > count){
            System.out.println("추가 위치 오류");
            System.out.println("현재 리스트 갯수 : " + count);
            return null;
        }

        if(position == 0){
            head = temp.next;
        } else{
            Item prev = null;
            for(int i = 0; i< position; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;

        }
        count--;
        System.out.println(position + "번째 항목 삭제");
        return temp;
    }



    public Item get(int position){

        int i ;
        Item temp = head;

        // position이 count보다 크면? x.
        // 검색위치 오류 메시지 출력,
        // null 값 리턴하기
        if(position >= count){
            System.out.println("검색 위치 오류");
             return null;
        }

        // 만약, 찾으려는 위치가 0인경우, head를 temp에 저장
        if(position == 0){
            temp = head;
        }

        // head부터 시작해서 원하는 위치까지 링크를 타고 들어감
        for(i = 0; i < position; i++){
            temp = temp.next;
        }
    
        return temp;
    }

    public void removeAll(){
        head = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }

    public void printAll(){
        if(count == 0){
            System.out.println("출력할 내용 없음");
            return;
        }

        Item temp = head;

        while (temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp != null){
                System.out.print(" -> ");
            }
        }
        System.out.println("");
    }


}