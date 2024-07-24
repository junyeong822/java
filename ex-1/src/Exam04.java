import java.util.Scanner;

public class Exam04 {

    public static void main(String[] args) {

        // 데이터 입력 받기
        // 키보드를 이용해서 데이터 입력받기

        // 키보드로부터 데이터를 입력받는 객체 sc를 선언하라.
        // Scanner의 형태로

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = sc.next(); // 문자열 변환하여 String 자료에 저장

        System.out.print("나이 입력 : ");
        int age = sc.nextInt(); // 숫자 변환하여 int 자료에 저장

        System.out.println("키 입력 : ");
        double height = sc.nextDouble(); // 실수 변환 double 자료에 저장

        System.out.println("<"+name+ "님의 정보>");
        System.out.println("-나이 : "+ age + " / 키 : " + height);
        
    }
}
