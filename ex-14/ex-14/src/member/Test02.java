package member;

public class Test02 {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member mem01 = new Member(1001, "이순신");
        Member mem02 =  new Member(1002, "김유신");
        Member mem03 = new Member(1003, "강감찬");
        Member mem04 = new Member(1004, "홍길동");

        memberHashMap.addMember(mem01);
        memberHashMap.addMember(mem02);
        memberHashMap.addMember(mem03);
        memberHashMap.addMember(mem04);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();




    }
}
