package Test;

public class Member {
    // 멤버 클래스
    // 멤버 아이디, 멤버이름, 나이를
    // 생성자를 통해서 값을 초기화
    // toString 재정의 - 멤버의 정보를 출력

    // MemberTest 클래스 - main 메서드에서
    // 객체를 생성하고 아래와 같이 값을 초기화 하시오.
    // member01 : 100, 홍길동, 30
    // member02 : 200, 이몽룡, 28

    public int memberId;
    public String memeberName;
    public int memberAge;

    public Member(){}

    public Member(int memberId, String memeberName, int memberAge){
        this.memberId = memberId;
        this.memeberName = memeberName;
        this.memberAge = memberAge;
    }

    @Override
    public String toString(){
        // this 안써줘도 멤버변수에 접근함. 가장 가깝기 때문에
        return memberId + "/" + memeberName +"/" +memberAge ;
    }


}
