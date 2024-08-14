package Exam;

public class Exam01 {

    public static void main(String[] args) {

        int result = 0;

        try{
            // 실행할 문장
            result = 10 / 0; // 예외발생 -> 해당하는 catch문으로 이동

            System.out.println("나누기 결과 : " + result);

        } catch (ArithmeticException e){
            // 예외처리 문장 = Exception 발생하면 실행할문장
            System.out.println("0으로 나누기 할 수 없음");
        }

        System.out.println("종료");

    }
}
