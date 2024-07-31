package encapsulation;

/*

    접근제한자
    - public : 모든 곳에서 접근 가능
    - protected : 상속관계에서 접근0, 패키지가 달라도 접근0
    - default : 상속0, 패키지 다르면 접근x
    - private : 내부접근

    캡슐화(encapsulation)
    - private으로 변수/메서드를 감추는 것을 - 정보은닉
    - 정보은닉을 활용한 캡슐화
        ㄴ 꼭 필요한 정보와 기능만 외부에 오픈함
        ㄴ 대부분의 멤버 변수와 메서드를 감추고
        ㄴ 외부에 통합된 인터페이스만(public 메서드) 제공하여 일관된 기능을 구현함
        ㄴ 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화 한다.

 */



public class MakeReport {
    
    // StringBuffer는 문자열을 누적해서 저장할 수 있는 클래스(자료형)
    public StringBuffer buffer = new StringBuffer();

    private String line = "===========================================\n";
    private String title = "  이름\t   주소 \t\t  전화번호  \n";

    private void makeHeader()
    {
        buffer.append(line); // append 메서드를 통해 문자열을 추가
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody()
    {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter()
    {
        buffer.append(line);
    }

    // 외부에서 접근 가능한 통합된 인터페이스
    // 일관된 기능이 구현
    public String getReport(){
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }





}
