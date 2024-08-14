package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam04 {

    // ~~~~ throws 예외클래스이름 { }
    // 예외가 발생하면 throws 뒤에 있는 예외 클래스 이름으로 예외가 발생하고
    // 호출했던 곳으로 되돌려 준다.

    public static void checkYourself() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("쉴 때 : 1) 사람들과 어울리는 것이 좋다.  2) 혼자서 쉰다");
        System.out.println("선택 >> ");

        int choice = sc.nextInt();

        if( choice == 1 ){
            System.out.println("당신은 E일 가능성이 높음");
        }  else {
            System.out.println("당신은 I일 가능성이 높음");
        }
    }

    // 예외 던지기
    public static void main(String[] args) {

        try{

            checkYourself(); // 함수호출

        }catch (InputMismatchException e){
            System.out.println("숫자 입력!");

        }catch (Exception e){
            System.out.println("기타 예외 발생!");

        }
    }
}
