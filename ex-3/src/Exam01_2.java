public class Exam01_2 {

    public static void main(String[] args) {
        int studentClass = 1;

        // case의 값을, 로 값 구분
        // :  대신  ->  변경 ( -> case 라벨)
        switch (studentClass){
            case 1, 2, 3 -> System.out.println("A그룹");
            case 4, 5, 6 -> System.out.println("B그룹");
            case 7, 8, 9 -> System.out.println("C그룹");
            default -> System.out.println("오류");
        }

        // 값을 리턴해서 변수에 저장
        String group = switch (studentClass){
            case 1, 2, 3 -> "A";
            case 4, 5, 6 -> "B";
            case 7, 8, 9 -> "C";
            default -> "오류";
        }; // 마지막에 세미콜론

        // 값을 리턴해서 변수에 저장 + 실행할 코드가 있는 경우
        // { } 묶어줌, 리턴값은 yield 키워드 붙여줌.
        // 리턴만 할경우 yeild 키워드 사용x, 중괄호x
        String group2 = switch (studentClass){
            case 1, 2, 3 -> {
                System.out.print("- 에이\t");
                yield "A";
            }
            case 4, 5, 6 -> {
                System.out.print("- 삐!\t");
                yield "B";
            }
            case 7, 8, 9 -> {
                System.out.print("- 씨!\t");
                yield "C";
            }
            default -> "오류";
        }; // 마지막에 세미콜론

        System.out.println(group2);
    }
}
