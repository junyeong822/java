package member;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

    // 중복데이터를 검사할때, hash코드가 같은지 여부를 검사한다.
    // 내용이 같아도 hash코드가 다르다면, 중복으로 처리X
    // 그래서 hash코드와 equal 메서드를 재정의해서 사용한다.

    public static void main(String[] args) {

        Member mem01 = new Member(100, "이순신");
        Member mem02 = new Member(200, "홍길동");
        Member mem03 = new Member(300, "이순신");

        MemeberHashSet memberHashSet = new MemeberHashSet();

        memberHashSet.addMember(mem01);
        memberHashSet.addMember(mem02);
        memberHashSet.addMember(mem03);


        memberHashSet.printAll();


    }
}
