package member;

import java.util.HashMap;
import java.util.Iterator;

/*

HashMap 설명

- Map 인터페이스를 구현한 클래스
- 가장 많이 사용됨
- key, value를 쌍으로 관리하는 메서드를 구현함

- 검색을 위한 자료구조
- key를 이용하여 값을 저정하고 key를 이용하여 값을 꺼내오는 방식 - hash 알고리즘으로 구현 됨
- key가 되는 객체는 중복될 수 없고 (value 중복이어도 됨)
- 객체의 유일성을 비교를 위한 equals()와 hashCode() 메서드를 재정의 해야함
  (ex. member - memberId를 기준으로 중복값 검사하게끔 재정의됨)
*/

public class MemberHashMap {

    // 제네릭에 변수 2개
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        // put 메서드 사용, 값이 짝궁
        // key, value 값을 쌍으로 넣어줘야 한다(매개변수 2개)

        // hashMap.put(멤버아이디, 멤버객체 )
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        // 해당 목록 안에 해당 키를 가지고 있냐?
        if( hashMap.containsKey(memberId) ) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 없음");
        return  false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()){
            int key = ir.next();
            Member member = hashMap.get(key); // key값에 해당하는 value를 반환
            System.out.println(member);
        }
        System.out.println();
    }


}
