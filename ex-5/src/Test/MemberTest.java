package Test;

public class MemberTest {
    public static void main(String[] args) {

        Member member01= new Member(100, "홍길동", 30);
        Member member02= new Member(200, "이몽룡", 28);

        System.out.println(member01); // 객체명만 출력 - 자동으로 toString 실행이된다.
        System.out.println(member02.toString());
    }
}
