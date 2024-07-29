public class Eaxm03 {

    public static void main(String[] args) {

        // 랜덤 숫자를 발생시키는 방법
        // 0~1미만의 실수를 발생시킨다


        for(int i = 0; i < 3; i++){
            double r = Math.random();
            System.out.println(r);
            System.out.println((int)(r * 10)); // 0~10미만의 숫자
            System.out.println((int)(r * 100)); // 0~100미만의 숫자
            System.out.println((int)(r * 100) + 1); // 1~100 숫자 원하면?
            System.out.println((int)(r * 46)); // 0~46미만의 숫자
            System.out.println("------");
        }

        // 1~100까지 숫자가 필요하면?

    }
}
