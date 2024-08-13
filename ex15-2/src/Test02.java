public class Test02 {
    public static void main(String[] args) {

        // 익명클래스 - 이름은 없고 한번만 사용 가능
        // 람다식으로 변경
        Calculator calc = (x,y) -> {
            return x + y;
        }; // 여기서 마지막에 세미클론 꼭 입력
        // 실행할 문장이 1개인 경우에는 중괄호와 return 키워드 생략가능

        System.out.println("----람다식으로 변경----");
        System.out.println(calc.add(10,20));
        System.out.println(calc.add(20,3));
    }
}

