//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // shift + F10 : 전체 컴파일
        // ctrl+F5 : 현재 프로그램중 변경된 부분만 컴파일 다시함
        // Alt + Enter : 자동 완성 ( import해야하는 것들 자동으로 입력되도록 하는 기능)

        // 컴퓨터는 무조건 데이터를 메모리 공간을 할당하고 사용한다.
        // 컴퓨터 : cpu - 뇌, ram(메모리) - 작업공간, 책상, hdd/ssd - 저장공간

        // 변수 : 값을 저장할 수 있는 메모리 공간
        // 선언할 때 - 자료형 키워드를 붙여준다.
        // 일반 자료형 = 정수, 실수, 문자  - int, double, char
        // 참조 자료형 = 주소값 가지고 있음 - String (문자열)

        // 메모리에 4byte 정수형 공간 확보하고 10이라는 값을 넣어라.
        // 그 메모리 공간은 num이라는 이름으로 사용할께

        int num = 10;
        double dNum = 3.14; // 실수형 저장, 8byte
        char ch = 'A'; // 문자 1개 저장, 2byte공간, 반드시 홀따옴표!
        boolean bool = true; // true or false값만 저장하는 용도

        String str = "만나서 반가워!"; // 문자열 저장, 반드시 쌍따옴표!

        int x= 20, y = 3;

        System.out.println("더하기 : " + x+y);
        System.out.println("빼기 : " + (x-y) );
        System.out.println("곱셈 : " + (x*y) );
        System.out.println("나눗셈 : " + (x/y) );

        System.out.println();

    }
}



