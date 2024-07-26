public class Exam02_4 {

    public static void main(String[] args) {

        // 3단이면 3*3까지만 출력하고 중지
        // 5단이면 5*5까지만 출력하고 중지 - 다음으로 넘어감

        // 구구단
        for ( int i = 2; i < 10 ; i++){

            if (i % 2 == 0){
                continue;
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println("--------------");
        }

        // for문 - 짝수단만 출력 ( if 사용)

    }
}
