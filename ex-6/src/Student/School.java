package Student;

// 싱글톤 패턴 - 설계
// ㄴ 객체가 1개만 생성되는 구조로 설계 (여러개 생성x)
// ㄴ static 이용

public class School {

    // private static으로 객체를 담을 변수 선언

    private static School instance = null;

    // private으로 생성자를 만든다 (보통 public)
    // ㄴ 외부 클래스에서 생성자 호출x = 객체 생성x
    private School(){}

    // public으로 외부에서 접근 가능한 메서드 생성
    // static변수를 사용하는 메서드에도 static을 붙여 줘야 한다.

    public static School getSchool(){
        // null 일때만 객체가 생성되고, 아니라면 기존 instance값 그대로 리턴
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

}
