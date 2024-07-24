import java.sql.SQLOutput;

public class Exam03 {

    public static void main(String[] args) {


        // 변수 : 값을 저장할 수 있는 메모리공간, 값이 변경 가능0
        // 상수 : 값 변경이 불가능
        /*
            리터럴 상수 - 이름이 없음 / 초기값, 직접써주는 값
            심볼릭 상수 - 이름 0 / 내가 직접 만들어 줌
         */

        int a = 10;
        String str = "hello";
        System.out.println("리터럴 상수");

        // 변수 선언과 동일, final 키워드 붙임
        // 변수명과 구분하기 위해, 전부다 대문자로 이름을짓는다
        // 구분기호는 _ 로 연결
        // MAX_BATTERY , ABC_TYPE, KOREA_NUM
        final int MAX = 100; 
        System.out.println(MAX);

        final double PI = 3.14195;
        int radius = 5;

        System.out.println( "원의 면적 : " + radius * radius * PI);


    }
}
