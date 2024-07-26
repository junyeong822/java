import java.util.Scanner;

public class Exam02_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1;

        while (n != 0) {
            System.out.println("숫자 입력 : 0이 들어오기 전까지 반복");
            n = sc.nextInt();
            System.out.println(n);
        }

        System.out.println("---while 종료---");

        System.out.println("for문 구현");
        // for(초기조건 ; 종료조건 ; 증감조건 )
        n = 99999;

        for ( ; n != 0 ; ) {
            System.out.println("숫자 입력 : 0이 들어오기 전까지 반복");
            n = sc.nextInt();
            System.out.println(n);
        }
        System.out.println("---for 종료---");

    }
}
