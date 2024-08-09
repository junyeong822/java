import java.util.ArrayList;
import java.util.Iterator;

public class MemberList {

    private ArrayList<Member> arrayList;

    public MemberList(){

        arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
        // add(값) : 마지막에 값 추가
        // add(인덱스번호, 값) : 해당 인덱스에 값 삽입
        // remove(인덱스번호) : 값 삭제
        // size : 현재 저장된 자료 갯수
    }

    public void addMember(Member member){  //ArrayList 에 멤버 추가
        arrayList.add(member);
    }

    // 컬렉션에 저장된 것 = 요소
    // 저장된 요소를 순차적으로 순회하는  iterator
    //
    /*
    iterator
    - hasNext() : 이 후에 요소가 더 있는지 체크, 요소가 있으면  true반환
    - next() : 다음에 있는 요소를 반환


     */
    public boolean removeMember(int memberId){

        Iterator<Member> ir = arrayList.iterator();
        while ( ir.hasNext()){
            Member member = ir.next(); // 다음 위치의 객체 가져옴
            int tempId = member.getMemberId();

            if(tempId == memberId){
                arrayList.remove(member); // 인덱스 번호 삭제, 객체값을 넣어줘도 됨.
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
        return false;

    }

    /*public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환

        for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음

            Member member = arrayList.get(i);
            int tempId = member.getMemberId(); // 현재 memberId 값을 tempId에 저장

            if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면
                arrayList.remove(i);           // 해당 멤버를 삭제
                return true;                   // true 반환
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
        return false;
    }*/

    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }

}
