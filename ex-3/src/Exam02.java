public class Exam02 {

    public static void main(String[] args) {

        /*
        while
         - 언제 반복이 끝날지 모름, 특정 조건이 들어오면 종료
         - ex) tv 리코컨, tv를 언제끌지 모름. 파워버튼 누르면 꺼짐.

         for
         - 반복 횟수를 알 수 있는 경우
         - ex) 학생 수 세기. 배열의 갯수 세는 경우,
               횟수가 정해진 경우, 알수 있는 경우, 한계가 있는 경우

         */

        int i = 0; // 카운트의 역할

        System.out.println("--- while문 증가");
        while (i < 3) {
            System.out.println(i++);
        }

        System.out.println("--- while문 감소");
        i = 3; // 역순 출력 -  큰수로 초기값 , --연산자
        while (i > 0) {
            System.out.println(i--);
        }

        // for으롤 쓰는게 유리함.
        // 증가
        System.out.println("--- for문 증가");
        for(i = 0; i < 3 ; i++){
            System.out.println(i);
        }

        // 감소
        System.out.println("--- for문 감소");
        for(i = 3; i > 0 ; i--){
            System.out.println(i);
        }

    }
}
