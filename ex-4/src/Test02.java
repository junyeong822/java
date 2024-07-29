import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {

        // 문제2번
        // 1~100사이의 랜덤 숫자 1개 발생
        // 사용자한테 정답을 입력받아서 맞추게 하기
        // 맞출때까지 반복
        // 랜덤 숫자가 - 입력한 숫자보다 작으면  up
        //                           크면  down



        // 몇번만에 맞췄는지? 마지막에 출력

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int com = (int)(Math.random() * 100 + 1);
        System.out.println(com);


        while (true){
            System.out.println("숫자 입력 >>");
            int num = sc.nextInt();
            cnt++;
            if( com == num){
                System.out.println(cnt + "회만에 정답!");
                break;
            } else if(com < num) {
                System.out.println("Down");
            } else{
                System.out.println("Up");
            }

        }






    }
}
