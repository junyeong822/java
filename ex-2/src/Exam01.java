//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exam01 {
    public static void main(String[] args) {

        // 변수명 규칙
        /*

        - 영어 대소문자, 숫자, 특수기호( _ , $)
        - 대소문자 구분, 공백x, 숫자로 시작x, 다른 특수기호 사용x
        - 예약어 변수명x (자바에서 이미 사용하기로 약속된 키워드, 단어)
            ㄴ예약어 : for, if, while, class, return...

        변수명 명명하는 규칙
        1) Kamel case - 일반적인 변수
        - userName, studentId

        2) Pascal case - 클래스이름
        - UserName, StudentId
        - HttpResoponse, HttpRequest

        3) Snake case (언더바 연결)
        - user_name, student_id
        - 상수이름 - 모두 대문자 : MAX_BATTERY, SERIAL_NUM, AB_TYPE, SAB_TYPE

        4) Kebab case (하이픈 연결)
        - user-name, student-id
        - html, css (웹페이지 만드는 언어)

        변수명 작명할 때 주의할 점
        - 변수의 용도에 맞게 이름을 짓는다
        ex)
            x, y, z - 의미가 불분명하고 용도 알기 어려움
            temp - 임시 변수, 실제 용도 파악 어려움.
            data - 구체적으로 어떤 데이터인지 알수 없음.
            a1, a2, a3 - 반복적이고 의미가 없음
            flag - 좀 더 구체적인 이름이 필요. 용도에 맞게

         - 주문번호 : orderNum, orderId
         - 학번 : studnetId
         - 학생이름 : studentName
         - 사원이름 : employeeName
         - 회원이름 : memberName - 그룹, 단체, 회사 가입되어 있는 회원, 소속원
         - 사용자이름 :  userName - 온라인상의 사용자


         문제 - 잘못된 점 찾아내시

           String user name; - 공백x
           String account number; 공백x
           int 1stPlace; - 숫자 시작x
           int 2ndAttempt;
           double Var; - Var / var는 다른 변수다
           double var;
           String my-variable; - 하이픈 사용

           int class;  - 예약어 변수명x (자바에서 이미 사용하기로 약속된 키워드, 단어)
           int return; - 예약어 : for, if, while, class, return...
         */

    }
}