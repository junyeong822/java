package Student;

public class Student {

    // 6가지 조건 맞춰서 설계

    // 학번, 학생이름, 점수

    // 1) private 변수
    // static 변수 : 프로그램 시작부터 종료시까지 유지
    // ㄴ 클래스 만들어질 때 데이터 영역에 자리잡는 변수
    // ㄴ 객체 생성될때마다 새로 만들어지는 변수가 아님 =  인스턴스 변수가 아니기 때문

    private static int serialNum = 100; // 클래스 만들어졌을때부터 메모리에 올라감

    // 객체가 생성될때 만들어짐
    private int studentId;
    private String studentName;
    private Subject subject;

    // 2)  기본 생성자
    public Student(){} // 기본생성자 - 클래스의 이름과 동일하게 적어준다.

    // 3) 생성자 오버로드
    public Student(String studentName, Subject subject){
        this.studentId = serialNum++; // 씨리얼넘버를 값으로 넣으주고, 씨리얼번호 값을 증가 시킨다
        this.studentName = studentName;
        this.subject = subject;
    }

    // 4) getter
    // 5) setter
    // 우클릭 - generate - getter and setter 클릭 ( 단축키 : alt + Insert)

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    // 6) toString
    public String toString(){
        return studentId + "/" + studentName;
    }


    public void showInfo(){
        System.out.printf("%d/%s %n", studentId, studentName);
        System.out.printf("-%s : %d점 %n", subject.getSubjectName(), subject.getScore());

    }


}

/*

    1. 클래스 개념
    - 클래스 = 설계도
    - 객체 ( 인스턴스) = 실제 생산된 물건 (메모리 공간)

     자료형 변수명 = 값;
     int num = 10;
     클래스명 객체명 = new 클래스명();

     - new 객체를 생성하는 키워드
     - 클래스의 형태대로 heap 영역에 메모리공간을 할당하고 주소값을 객체명에 저장한다.
     - 객체명의 이름으로 heap 영역의 메모리공간을 사용할 수 있다(접근 가능)
        ㄴ 객체명 = 참조변수 : stack 영역에 메모리 생김

     ※ 메모리 공간
     - 코드 : 코드들이 올라간 영역
     - 데이터 영역 : static키워드 사용, 프로그램 시작부터, 종료시까지 유지되는 값
     - 스택 영역 : { } 내에서 유효, { } 벗어나면, 메모리에서 소멸.
     - 힙 영역 : new 키워드를 통해 생성. 가비지 컬렉터가 사용하지 않으면 자동으로 회수해줌.


    2. 클래스의 구성요소
    1) 멤버변수 = 필드 = 인스턴스 변수
        - 정보, 속성, 상태 등을 저장한다
    2) 생성자
        - 초기화
    3) 메서드 (함수)
        - 기능을 담당 - 1개 메서드 당, 1개의 기능을 담당하도록 설계
            ㄴ toString() 메서드 : 상위 클래스인 Object의 기능을 재정의해서 사용
            ㄴ getter 메서드 : 멤버변수의 값 - 가져오기
            ㄴ setter 메서드 : 멤버변수의 값 - 저장

    3. 잘 설계된 클래스의 6가지 조건 (VO, DTO)
    - 자료를 담는 역할 : VO - Value Object / DTO : Data Transfer Object

    1) 멤버변수 - private 선언 - 정보은닉
    2) 기본생성자
    3) 생성자 오버로드 통해서 - 값을 초기화
    4) getter 메서드 생성
    5) setter 메서드 생성
    6) toString 오버라이딩(재정의) - 객체의 값을 확인 하는 용도

    4. 오버라이딩과 오버로드의 차이점
    - 오버라이딩 : 상속 - 자식 클래스가 부모 메서드를 상속받아 기능을 재정의해서 사용
    - 오버로드 : 이름이 같은 메서드 여러개 생성 가능. 단, 매개변수 다르게

    */








