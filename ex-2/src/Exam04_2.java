import java.sql.SQLOutput;
import java.util.Scanner;

public class Exam04_2 {

    public static void main(String[] args) {

        // 조건문
        // 성적 평가

        int score = 87;
        String grade = "";

        if (score >=90 ){
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }  else if (score >= 70 ){
            grade = "C";
        }  else if (score >= 60 ){
            grade = "D";
        }  else { // 그외 외에는~~ 나머지는~~
            grade = "F";
        }
        System.out.println(grade);



        // 1) 미세먼지 수치를 입력받아서 판정 해주는 프로그램 작성
        // 인터넷에서 기준
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("미세먼지 수치 : ");
        int dust = sc.nextInt();

        if(dust>=150){
            System.out.println("매우 나쁨");
        } else if( dust>=80){
            System.out.println("나쁨");
        } else if(dust>=30){
            System.out.println("보통");
        } else{
            System.out.println("좋음");
        }
    */

        // 2) 키(m), 몸무게(kg)를 입력 받아 bmi 수치를 계산하고,
        // 저체중, 정상, 과체중, 비만인지 판정

        /*
        System.out.println("키를 m 단위로 입력 : ");
        double height = sc.nextDouble();

        System.out.println("몸무게를 kg단위로 입력 : ");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height) ;
        
        if (bmi >= 30){
            System.out.println("비만");
        }else if (bmi >= 25){
            System.out.println("과체중");
        } else if (bmi >= 20) {
            System.out.println("정상");
        } else{
            System.out.println("저체중");
        }

        System.out.println(bmi);
        */


        // 3) 구매 금액을 입력 받아, 10000원이상 구매 고객의 경우
        // 구매 금액의 10% 적립, 그 외에는 5%로 적립
        // 할인은 5% 할인, 그 외에는 3% 할인율 적용
        // 실제 구매 금액(=할인 된 금액)과 적립된 포인트를 출력하시오.

        int price = sc.nextInt();
        double discoutRatio = 0;
        double pointRation = 0;

        if (price >= 10000){
            discoutRatio = 0.05;
            pointRation = 0.1;
        } else{
            discoutRatio = 0.03;
            pointRation = 0.05;
        }
        int total = (int) (price * (1-discoutRatio));
        int point = (int) (price * pointRation);

        System.out.printf("계산액 : %d, 포인트 : %d", total , point );

        // 4) 경복궁 입장료 계산 ( 중첩 if)
        // 내국인 or 외국인 , 나이, 종로구민 여부 등 입력 받아서 계산하기




    }
}
