import java.util.Scanner;

public class Exam02_3 {

    public static void main(String[] args) {

        // 삼항연산자

        // case 1 : (조건) ? 참 : 거짓;
        // cas3 2 : 변수 = (조건) ? 참 : 거짓;
        /*
        boolean genderState = true; // gender - true, 남자 / 여자
        String gender = (genderState == true) ? "남자" : "여자";
        System.out.println(gender);
        
        // 값을 입력 받아서, 1이면 남자, 2이면 여자로 출력
         Scanner sc = new Scanner(System.in);
        System.out.println("1 or 2 코드 입력 : ");
         int gednerCode = sc.nextInt();

        System.out.println(  (gednerCode == 1) ? "남" : "여" );

        // 남 입력받으면 1 출력 , 여 입력받으면 2 출력
        // 입력 받는 내용이 문자열.
        // 문자열이 같은지 비교할 때 == 연산자 사용x.
        // 변수명.equals(변수)
        // 변수명.equals("문자열")
        System.out.println("남 or 여 입력 : ");
        String genderStr = sc.next();

        int genderCode2 = genderStr.equals("남") ? 1 : 2;
        System.out.println(genderCode2);

        */

        // 삼항연산자, 비교연산자, 스캐너 이용한 문제
        Scanner sc = new Scanner(System.in);

        // 1번 ) 올해 년도를 입력 받고 윤년인지 아닌지 출력, 평년 vs 윤년

        System.out.print("년도 입력 : ");
        int year = sc.nextInt();
        boolean isLeapYear = year % 4== 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println( isLeapYear ? "윤년" : "평년");


        // 2번 ) 두 사람의 나이를 입력 받고, 나이가 더 많은 사람의 나이 출력
        //  ex) 첫번째 사람이 나이가 더 많습니다, 두번째 사람이 나이가 더 많습니다

        System.out.print("나이 1 : ");
        int age1 = sc.nextInt();
        System.out.print("나이 2 : ");
        int age2 = sc.nextInt();
        System.out.println((age1 > age2 ? "첫번째" : "두번째")  + " 사람이 나이가 더 많습니다");

        // 3번 ) 점수가 0~100 값으로 입력 받으시오.
        // 잘 못 입력 --다시 입력  / 정상이라면 - 정상 으로 출력
        System.out.println("점수 입력 : ");
        int score = sc.nextInt();
        System.out.println( score < 0 || score > 100 ? "다시 입력 " : "정상 입력");
        

        // 4)


    }
}
