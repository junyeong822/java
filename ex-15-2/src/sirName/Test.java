package sirName;

public class Test {

    public static void main(String[] args) {
        // 자료형 = 인터페이스형

        // 익명클래스로 메서드 정의
        SirName test01 = new SirName() {
            @Override
            public String sirName(String name) {
                return name + "님";
            }
        }; //<-- 세미콜론

        // 람다식 : lambda
        // 실행 문장이 1줄이고, return문만 있는 경우, return과 중괄호 생략 가능
        // 매개변수가 1개인경우 () 괄호 생략가능
        SirName test02 = name ->  name + "님";

        System.out.println(test01.sirName("홍길동"));
        System.out.println(test02.sirName("강감찬"));



    }
}
