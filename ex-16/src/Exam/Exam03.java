package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            int[] cards = {4,5,1,2,7,8};

            System.out.println("몇번째 카드 뽑으시겠습니까?");
            int cardIndex = sc.nextInt();
            System.out.println("뽑은 카드 번호 : " + cards[cardIndex]);

            // 다중 catch 사용하기
        } catch (InputMismatchException e){
            System.out.println("숫자만 입력 가능");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("0~5 사이 숫자 입력" );

        } catch (Exception e){ 
            // 다중 catch 가장 마지막에 와야 함.
            // 다른 Exception의 상위 클래스이기 때문에 먼저 써주면 모두다 기본Exception으로 처리된다.
            System.out.println("예외 발생!");
        } finally {
            // 모든 코드를 실행한 뒤, 예외 발생 여부 상관없이 무조건적으로 실행되는 코드
            // 반드시 처리해야 하는 구문
            System.out.println("종료");
        }

        sc.close(); // 입력 종료



    }
}
