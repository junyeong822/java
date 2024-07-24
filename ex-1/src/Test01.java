import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // +, -, *, / , % : 나머지 구할때

        // 1. 숫자 2개를 입력 받아서 , 사칙연산 결과를 출력하시오
        // ex) 덧셈, 뺄셈, 몫, 나머지, 소수점까지 나눈 값

/*
        System.out.print("숫자 1 :");
        int n1 = sc.nextInt();
        System.out.print("숫자 2 :");
        int n2 = sc.nextInt();

        // print : 줄바꿈x
        // println : 줄바꿈0
        // printf : 서식문자를 통해 변수값을 출력, 줄바꿈x

        // 서식문자 : %d : 정수, %f : 실수
        // %.2f : 실수형 - 소수점 둘째자리까지 표시

        System.out.printf("덧셈 : %d \n", n1+n2 );
        System.out.printf("뺄셈 : %d \n", n1-n2);
        System.out.printf("곱셈 : %d \n", n1*n2);
        System.out.printf("몫 : %d \n", n1/n2);
        System.out.printf("나머지 : %d \n", n1%n2);
        System.out.printf("소수점 나누기 : %.2f \n", (double)n1+n2);

*/

        // 2. 라면 개수를 입력 받아서, 박스 갯수와 남은 갯수를 출력
        // ex) 1box 20개 ,  48 -> 2박스, 8개 남음 출력

        /*
        System.out.print("라면갯수 입력 : ");
        int ramen = sc.nextInt();
        System.out.printf("%d box / %d개 남음", ramen / 20, ramen % 20 );
        */


        // 3. 학생의 정보를 입력 받은 후 출력하시오
        // - 이름 : 이몽룡 / 학번 : 100 / 학년 : 3 / 점수 평균 : 85.7

        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("학번 : ");
        int studentId = sc.nextInt();

        System.out.print("학년 : ");
        int grade = sc.nextInt();

        System.out.print("평균 : ");
        double avg = sc.nextDouble();

        System.out.printf("이름 : %s, 학번 : %d, 학년 : %d, 평균 : %.1f", name, studentId, grade, avg);

    }
}
