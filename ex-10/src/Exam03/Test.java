package Exam03;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tour tour = null;

        System.out.println("어느 나라로 여행하시겠습니까?");
        System.out.println("1) 한국  2) 일본 3) 대만");
        int choice = sc.nextInt();

        // 입력 받은 번호에 따라 객체 연결을 다른것을 해줌
        // Tour 인터페이스를 통해 규격을 통일했기 때문에
        // 다형성이 적용되어 tour에 구현 클래스를 모두 연결 0K
        switch (choice){
            case 1 -> tour = new KoreaTour();
            case 2 -> tour = new JapanTour();
            case 3 -> tour = new TaipeiTour();
        }

        Guide guide = new Guide("홍길동", tour);
        guide.tourProgram();

    }
}
