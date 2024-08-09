//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        MemberList list = new MemberList();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberKang = new Member(103, "강감찬");
        Member memberHong = new Member(104, "홍길동");

        list.addMember(memberLee);
        list.addMember(memberKim);
        list.addMember(memberKang);
        list.addMember(memberHong);

        list.showAllMember();

        // 멤버 아이디로 찾아서 삭제하는 로직
        // 원래 ArrayList의 remove(인덱스 번호)
        // for 문을 통해서 memberId와 일치하는 인덱스 번호를 찾아냄
        // 해당 인덱스번호로 삭제 하는 구문이
        // removeMember 메서드 안에 구현
        list.removeMember(101);

        list.showAllMember();


    }
}